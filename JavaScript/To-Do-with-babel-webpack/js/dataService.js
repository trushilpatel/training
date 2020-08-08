// save Note to the localstorage
function saveNote(note) {
  let Notes = getNotes();
  note['id'] = generateUniqueNoteID();
  note['complete'] = false;

  console.log(note.id + " : saved" )
  Notes.push(note);
  saveAllNotes(Notes);
}


// Get notes from localstorage
function getNotes() {
  let Notes = localStorage.getItem("Notes");
  // check wheather notes exist or not
  if (!Notes) {
    Notes = []
  } else {
    Notes = JSON.parse(Notes);
  }
  return Notes;
}

// Delete Note
function deleteNote(noteId) {
  Notes = getNotes();

  // delete all notes
  deleteAllNotes();

  Notes = Notes.filter(function (note) {
    return note.id != noteId;
  })

  // store notes
  localStorage.setItem("Notes", JSON.stringify(Notes))
  console.log("deleted : " + noteId)
  // render notes
  renderNotes()
}

// delete all notes
function deleteAllNotes() {
  localStorage.removeItem("Notes")
  console.log("deleted : All Notes");
}

// save all Notes 
function saveAllNotes(Notes){
  localStorage.setItem("Notes", JSON.stringify(Notes));
}

// make note complete
function completedNote(noteId){
  let Notes = getNotes();
  deleteAllNotes();

  for (let note of Notes){
    if (note.id == noteId){
      note.complete = !note.complete;
      console.log(noteId + " complete set to : "  + note.complete )
    } 
  }
  console.log(Notes)
  saveAllNotes(Notes);
  renderNotes();
}