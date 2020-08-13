let express = require('express')
require('./db/mongoose')
let env = require('dotenv')
env.config('.env')
let app = express()

app.use(express.json())

// routes
let userRoutes = require('./routes/user-routes')
let taskRoutes = require('./routes/task-routes')

app.use('/api/user', userRoutes)
app.use('/api/task', taskRoutes)


app.all('*', function (req, res) {
  res.send("ERROR: 404 ")
})


app.listen(3000, function () {
  console.log("Server is listening on localhost:3000")
})