let express = require('express')
let path = require('path')
let hbs = require('hbs')
let app = express();

// routes
let Weather = require('./weather')

// hbs configuration
let partialPath = path.join(__dirname, '../template/partial')
hbs.registerPartials(partialPath)

// APP configuration
let staticFilesPath = path.join(__dirname, '../public');
let viewsPath = path.join(__dirname, '../template')
app.use(express.static(staticFilesPath))
app.set('views', viewsPath)
app.set('view engine', 'hbs')

app.use('/api', Weather.router)
app.use('', function (req, res){
  res.render('index',{
    title: "Weather",
    footer: "copyright Trushil Patel"
  })
})


app.all('*', function ( req, res) {
  res.send('Error 404')
})


app.listen(3000, () => console.log("localhost:3000"))