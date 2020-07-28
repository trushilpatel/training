const express = require('express');

const MongoClient = require('mongodb').MongoClient;
const uri = "mongodb+srv://trushil:1234@cluster0-r7wes.mongodb.net/users?retryWrites=true&w=majority";
const client = new MongoClient(uri, { useNewUrlParser: true });

const bodyParser = require('body-parser');

const app = express();

app.set('view engine', 'ejs');
app.use(bodyParser.urlencoded(
  {extended: true}
))

app.get('/',function (req, res){
  console.log("GET /")
  res.render('login');
})

app.post('/login', function(req, res){
  let username = req.body.username;
  let password = req.body.password;
 
  client.connect(function(err, client){
    const db = client.db("users");
    const col = db.collection("users")

    col.findOne({'username': username, 'password': password})
    .then(userData =>{
      console.log(userData)

      if (userData == null){
        console.log("NULLL")
        res.send(
              {message: "Enter valid username or password"
      })
      } else {
              res.render('home')
            }
    })
    .catch(err=>console.log("ERROR IN POST "))
  console.log(username, password)
})
})

app.get('/show', function (req, res){
  client.connect(function(err, client){
    const db = client.db("users")
    const col = db.collection("users")
    const users = []

    col.find({},function (err, user){
      user.forEach(
        ele=> {
          users.push(ele); 
          console.log(ele)
        })
      .then(()=>  {
        res.send(users); 
        console.log(users)
      })
    })
    });
    });

app.get('/insert', function(req, res){
  res.render('insert')
})

app.post('/insert', function(req, res){
  client.connect(function(err,client){
    const db = client.db('users')
    const col = db.collection('users')
    const user = {
      username: req.body.username,
      password: req.body.password
    }

    console.log(user)
    
    col.insertOne(user).then(result=> res.send(result))
  })
})

app.listen(8080, ()=>{
  console.log("Server is running on http://localhost:8080")
})