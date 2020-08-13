let JWT = require('jsonwebtoken')
let User = require('../../models/user')

async function isValidToken(token) {
  if (token == "Bearer null" || !token) {
    return false;
  } else {

    try {
      let tempToken = token.replace('Bearer ', '')
      let decoded = JWT.verify(tempToken, '1234')
      let validUser = await User.findOne({ email: decoded.email, 'tokens.token': tempToken }).exec()

      if (validUser) {
        return true;
      } else {
        return false;
      }

    } catch {
      return false;
    }
  }
}

async function auth(req, res, next) {
  let validToken = await isValidToken(req.header('Authorization'))
  console.log("AUTH validToken : " + validToken)
  if (validToken) {
    next()
  } else {
    res.send({ "Error": "AUTH please Login again" })
  }

}


module.exports = { isValidToken, auth };