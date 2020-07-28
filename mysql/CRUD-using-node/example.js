var mysql = require('mysql');
var faker = require('faker');
const { fake } = require('faker');

var connection = mysql.createConnection(
  { 
    host : "localhost",
    user: "root",
    password: '1234',
    database: "practicle"
   }
)

var insertData = (email) => {
  var q = "insert into users set ?";
  connection.query(q,person);
}

var showData = () => {
  connection.query("select * from users;", function (err, results, fields) {
    if (err) console.log("error occurred")
    console.log(results);
  })
}

for (let i = 0; i < 500; i++)
{
  var person = {
    email: faker.internet.email(),
    created_at: faker.date.past()
  };
  insertData(faker.internet.email());  
}

showData();

connection.end();
