const generateMessage = (userData) => {

  let response = {
    username: userData.username,
    text: userData.text,
    room: userData.room,
    createdAt: new Date().getTime()
  }
  return response
}

const generateLocationMessage = (url) => {
  return {
    url,
    createdAt: new Date().getTime()
  }
}

module.exports = {
  generateMessage,
  generateLocationMessage
}