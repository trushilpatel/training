let users = new Map();

function insertUser(id, userData) {
  return users.set(id, userData)
}

function deleteUser(id) {
  return users.delete(id)
}

function getUser(id) {
  return users.get(id)
}


module.exports = {insertUser, deleteUser, getUser}