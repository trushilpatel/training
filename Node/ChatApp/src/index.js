const path = require('path')
const http = require('http')
const express = require('express')
const socketIO = require('socket.io')
const Filter = require('bad-words')
let { insertUser, deleteUser, getUser } = require('./utils/userManager')
const { generateMessage, generateLocationMessage } = require('./utils/messages')

const app = express()
const server = http.createServer(app)
const io = socketIO(server)

const port = process.env.PORT || 3000
const publicDirectoryPath = path.join(__dirname, '../public')

app.use(express.static(publicDirectoryPath))



io.on('connection', (socket) => {
  console.log('New User connected')

  socket.on('join', function (userData) {
    insertUser(socket.id, userData)
    socket.join(userData.room)
    socket.emit('message', generateMessage({ username: userData.username, text: 'Welcome!' }))
    socket.broadcast.to(userData.room).emit('message', generateMessage(`${userData.username} has joined!`))

  })


  socket.on('sendMessage', (userData, callback) => {
    const filter = new Filter()

    if (filter.isProfane(userData.message)) {
      return callback('Profanity is not allowed!')
    }

    let response = generateMessage(userData)
    console.log(response)
    socket.broadcast.to(response.room).emit('message', response)
    callback()
  })

  socket.on('sendLocation', (coords, callback) => {
    io.emit('locationMessage', generateLocationMessage(`https://google.com/maps?q=${coords.latitude},${coords.longitude}`))
    callback()
  })

  socket.on('disconnect', () => {
    let user = getUser(socket.id)
    console.log("disconnect : ", user)
    if (user) io.emit('message', generateMessage({ username: user.username, text: `${user.username} has left the chat room!` }))
  })
})

server.listen(port, () => {
  console.log(`Server is up on port ${port}!`)
})