let fs = require('fs')

function getNotes() {
  let notes = fs.readFileSync('notes.json').toString();

  if (notes == '') {
    notes = []
    saveNotes(notes)
  } else {
    notes = JSON.parse(notes)
  }

  return notes;
}

function saveNotes(notes) {
  fs.writeFileSync('notes.json', JSON.stringify(notes))
}

function addNotes(note) {
  debugger
  let notes = getNotes();
  let newNote = {}

  if (note.hasOwnProperty('title')) {
    newNote['title'] = note.title
    notes.push(newNote)
    saveNotes(notes)
  }
}

function showNotes(note) {
  let notes = getNotes();
  
  notes.forEach((note) => console.log(note))
}

function deleteNote(note) {
  let notes = getNotes();

  notes = notes.filter((n) => {
    return n.title != note.title
  })

  saveNotes(notes)
}

module.exports = { getNotes, saveNotes, addNotes, showNotes, deleteNote }