var express = require("express")
var app = express()


// define the home page route
app.get('/', function (req, res) {
  res.send('Birds home page')
})
// define the about route
app.get('/about', function (req, res) {
  res.send('About birds')
})

app.listen(8080);