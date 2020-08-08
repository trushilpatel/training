function generateUniqueNoteID(){
  let id = "";
  id += Date.now();
  id += Math.round(Math.random()*(100))
  
  return id;
}
