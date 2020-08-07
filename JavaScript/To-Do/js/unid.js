function generateUniqueNoteID(){
  let id = "";

  id += Date.now();

  id += Math.round(Math.random()*(100000))

  return id;
}

console.log(uniqueNoteID())