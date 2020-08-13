
function formateUserData(user) {
  
  delete user['password']
  delete user['tokens']
  delete user['__v']
  delete user['_id']

  return user;
}


async function formateUserArray(users) {

  users = users.map(function (user) {
    return formateUserData(user.toObject())
  })

  return users
}



module.exports = { formateUserArray, formateUserData }