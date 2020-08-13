let User = require('../../models/user')
const bcrypt = require('bcrypt')
const JWT = require('jsonwebtoken')
const { formateUserData, formateUserArray } = require('../../services/utils/User/formateUserData')


async function getAllUser() {
  return await formateUserArray(await User.find().exec());
}

async function getUser(id) {

  try {
    let user = await (await User.findById(id).exec()).toObject();
    return formateUserData(user)

  } catch (error) {
    console.log(error)
    return { Error: "User not found" }
  }
}


async function getAllTasksOfUser(Authorization) {
  console.log(Authorization)
  let email = (await JWT.verify(Authorization.replace('Bearer ',''), '1234')).email

  let user = await (User.findOne({ email: email }))
  await user.populate('tasks').execPopulate()

  return user.tasks;
}


async function insertUser(user) {
  let tempUser = new User(user)
  try {
    return await tempUser.save()
  } catch (error) {
    return {
      error: "User already Exists"
    }
  }
}


async function deleteUser(id) {
  return await User.deleteOne({ _id: id }).exec();
}


async function generateAndSaveToken(user) {
  let tempUser = await (await User.findOne({ email: user.email }));

  tempUser = User.generateJWT(user)
  return tempUser
}


async function updateUser(user) {

  try {

    const tempUser = await User.findOne({ email: user.email });
    let allowedUpdate = ['name', 'email', 'age', 'password']

    // user not found
    if (!tempUser) {
      return { error: "user is not Exist" }

    } else {

      let updatedFields = Object.keys(user)

      updatedFields.forEach(key => {
        if (allowedUpdate.indexOf(key) > -1) { tempUser[key] = user[key] }
      })

      return await tempUser.save();

    }

  } catch (err) { console.log(err) }

}


async function deleteToken(authorization) {
  let token = authorization.replace('Bearer ', '')
  let decode = JWT.verify(token, '1234')

  let user = await User.findOne({ email: decode.email })
  user.tokens = user.tokens.filter((t) => {
    return t.token !== token
  })

  user.save()
}


async function deleteAllToken(authorization) {
  let token = authorization.replace('Bearer ', '')
  let decode = JWT.verify(token, '1234')

  let user = await User.findOne({ email: decode.email })
  user.tokens = user.tokens.filter((t) => {
    return t.token !== t.token
  })

  user.save()
}


module.exports = {
  getAllUser,
  getUser,
  deleteUser,
  updateUser,
  insertUser,
  generateAndSaveToken,
  deleteToken,
  deleteAllToken,
  getAllTasksOfUser
}