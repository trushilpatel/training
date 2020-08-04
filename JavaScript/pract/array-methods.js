let notes = [1,2,3,4];

notes.splice(Infinity,5,9,8,7,6,5);
console.log(notes)

notes.push("push");
console.log(notes)

notes.shift("shift")
notes.unshift("unshift")
console.log(notes)

console.clear();

notes.forEach(function (item,index){
  console.log(item,index)
})

console.clear();


console.log("**************************")
for( let item of notes){
  console.log(item)
}

console.clear();

console.log(notes.indexOf("hello") == -1 )

console.log(notes)
console.clear();

var filteredNotes = notes.filter(function (note, index){
  if (index > 3) return true;
})

console.log(filteredNotes)

const mapNotes = notes.map(function (value, index){
  return value*3;
})

console.log(mapNotes)

notes.sort()
console.log(notes)