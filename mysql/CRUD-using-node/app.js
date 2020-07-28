var express = require('express');
var app = express();
var mysql = require('mysql');
var faker = require('faker');
const { count } = require('console');
var bodyParser = require('body-parser');
const { connect } = require('tls');

app.set("view engine", "ejs")
app.use(bodyParser.urlencoded(
  { extended: true }
))

var connection = mysql.createConnection(
  { 
    host : "localhost",
    user: "root",
    password: '1234',
    database: "online_shows"
   }
)


app.get("/", function (req,res){
  console.log("/")
  connection.query("select count(*) as total from users;",function(err, results, fields){
    console.log(results[0].total)
    res.render("home", {data: results[0].total})
  })
})

app.post("/register", function (req,res){
  var body = req.body.email;
  console.log(req.body)
  connection.query("insert into users set ?", req.body, function(err, results,field){
    if (err) console.log("error in /register")
    console.log(results)
    res.send("successfully registered")
  })

})
var output;
app.get("/stored_procedure", function(req,res){
  connection.query("set @a=2;")
  connection.query("CALL getSelectedShow(?,?,@a)",[10,8],function(err, results,field){
    if(err) console.log("error /stored_procedure")
    console.log(results)
    res.send(results)
    console.log("Output : ", output)
  })
})

app.get("/show_users", function (req, res) {
  console.log("/show_users")
  connection.query("select * from users;",function(err, results, fields){
    if (err) console.log("Error /show_users")
    res.json(results)
  })
});

app.listen(8080, function(){
  console.log("App is listening on 8080")
})