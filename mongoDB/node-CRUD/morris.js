const { Db } = require("mongodb");

use morris;

db.park.insert(
  {
    "address": {
      "building": "1007",
      "coord": [ 73.856077, 40.848447],
      "street": "Morris Park Ave",
      "zipcode": "10462"
    }, 
    "borough": "Bronx",
    "cuisine": "Bakery",
    "grades": [
      { "date": { "$date": 1393804800000 }, "grade": "A", "score": 2 },
      { "date": { "$date": 1378857600000 }, "grade": "A", "score": 6 },
      { "date": { "$date": 1358985600000 }, "grade": "A", "score": 10 },
      { "date": { "$date": 1322006400000 }, "grade": "A", "score": 9 },
      { "date": { "$date": 1299715200000 }, "grade": "B", "score": 14 }
    ], "name": "Morris Park Bake Shop",
    "restaurant_id": "30075445"
  }
)


1. db.park.find().pretty()
2. db.park.find({}, {_id:0,restaurant_id:1, borough:1, cuisine:1})  
3. db.park.find().count()
4. db.park.find().limit(4)
5. db.park.find().skip(4).limit(3)
6. db.park.find({"grades.score" : {$lt: 40, $gt: 20}})
7. db.park.aggregate([
  {
      $project:{ 
          longitude: { $arrayElemAt: [ "$address.coord", 0 ] },
          latitude: { $arrayElemAt: [ "$address.coord", -1 ] }
      }
  },{
    $match : {
      longitude: {$gt: 95.754168}
    }
  }     
])

8,10. db.park.aggregate([
  {
    $match : {"grades.score": {$gt: 70}}
  }, 
  {
    $project: {
      score: 1,
      latitude: {$arrayElemAt: ["$address.coord",0]},
      longitude: {$arrayElemAt: ["$address.coord",-1]}
  
    }
  },
  {
   $match: {
     longitude: {$lt: 65}
   } 
  }
])

9. db.park.aggregate([
  {
    $match: {cuisine: {$neq: "Americal"}}
  },
  {
    $sort: {cuisine: -1}
  }
])
10. db.park.find({cuisine: {$exists: false}})
11. db.park.aggregate([
  {
    $project:{
      matched: {$eq: [{$substrCP: ["$name",0,3]},"Mor"]},
      name: 1
    }
  },
  {
    $match : {
      matched : {$eq: true}
    }
  }
])

12. db.park.find({$and: [{"grades.grade": 'A'}, {"grades.score": {$gt: 10}}]})
13. db.park.find({}).sort({ name: 1, borough: -1})
14. db.park.find({$and: [{"grades.grade": 'A'}, {"grades.score": {$gt: 10}}]})
15. db.park.aggregate([
  {
    $unwind: "$grades"
  },
  {
    $project:{
      matched: {$eq : [{$mod : ["$grades.score",5]}, 0]},
      name: 1
    }
  }
])

16. db.park.find().sort({cuisin: 1})
17. 
21. 
22. mongodump , mongorestore