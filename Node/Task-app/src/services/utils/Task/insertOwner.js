let User = require('../../../models/user')
let JWT = require('jsonwebtoken')


async function insertOwner(req, res, next) {

  let decoded = JWT.verify(req.header('Authorization').replace('Bearer ', ''), '1234')

  req.body.owner = ( await User.findOne({email: decoded.email})).toObject()["_id"]
console.log(req.body)
  next()
}


module.exports = insertOwner