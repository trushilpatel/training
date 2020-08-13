let mongoose = require('mongoose')
let bcrypt = require('bcrypt')
let JWT = require("jsonwebtoken")
let task = require("../models/task")
const Task = require('../models/task')

// Schema
const UserSchema = mongoose.Schema(
  {
    name: {
      type: String,
      required: true,
      trim: true
    },
    email: {
      type: String,
      unique: true,
      validator: function (value) {
        return validator.isEmail(value)
      }
    },
    password: {
      type: String,
      minLength: 10,
      validator: function (value) {
        return value.length > 5
      }
    },
    age: {
      type: Number,
      min: 10,
      max: 100,
      default: 18
    },
    avatar: {
      type: Buffer
    },
    tokens: [{
      token: {
        type: String,
        required: true
      }
    }]
  }, {
  timestamps: true
})


UserSchema.virtual('tasks', {
  ref: 'Tasks',
  localField: '_id',
  foreignField: 'owner'
})

// GenerateJWT
UserSchema.statics.generateJWT = async function (user) {
  /*
    user : type => mongoose model  
  */
  let requiredUserData = {}

  requiredUserData.email = user.email;
  const token = await JWT.sign(requiredUserData, '1234')

  user.tokens = user.tokens.concat({ token })
  user.save()

  let responseData = {}
  responseData.token = token
  return responseData;

}


// AuthenticateUser
UserSchema.statics.authenticateUser = async function (email, password) {

  let user = await User.findOne({ email })

  if (!user) return { error: "User Not Found" }

  let validPassword = await bcrypt.compare(password, user.password)

  if (!validPassword) return { error: "Enter Valid Password" }

  return user;
}


// Bcrypt Hash Password
UserSchema.pre('save', async function (next) {
  const user = this;
  if (await user.isModified('password')) user.password = await bcrypt.hash(user.password, 8)
  next()
})


UserSchema.pre('deleteOne', async function (next) {
  const user = this
  console.log(user._conditions._id)
  console.log("********************************")
  await Task.deleteMany({ 'owner': user._conditions._id })
  next()
})

UserSchema.statics.decodeJWT = async function (Authorization) {
  let decode = await JWT.verify(Authorization.replace('Bearer ', ''),'1234')
  let user = await User.findOne({ email: decode.email })
  return user
}

// exports
let User = mongoose.model("User", UserSchema)
module.exports = User