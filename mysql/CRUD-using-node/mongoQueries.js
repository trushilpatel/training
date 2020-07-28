db.person.insertOne({
  name: "Harshil",
},
{
  writeConcers :{
    w: 1, //  0/1 for acknowledgement default 1
          /* consider a 3-member replica set with a primary and 2 secondaries. 
          Specifying w: 2 would require acknowledgment from the primary and one of the secondaries. 
          Specifying w: 3 would require acknowledgment from the primary and both secondaries.
          */
    j: true, // true/false  for journal  default false 
    wtimeout: 100 // timeout for response
  }  
}
)

db.person.insertMany([{
  name: "Harshil",
},{
  name: "Prem"
},{
  name: "Yashwant"
}],
{
  writeConcers :{
    w: "majority", //  0/1/2/3 for acknowledgement default 1   find out about oprtions 2,3
    j: true, // true/false  for journal  default false 
    wtimeout: 100 // timeout for response in milliseconds applicable on w>=1
  }  
}
)

db.users.aggregate([{$match : {}}])