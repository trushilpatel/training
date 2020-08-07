// save Note to the localstorage
function saveNote(note) {
  let Notes = getNotes();

  let uniqueNoteID = generateUniqueNoteID();
  Notes.push({ uniqueNoteID: JSON.stringify(note) });

  localStorage.setItem("Notes", JSON.stringify(Notes));

  console.log("Note saved")
  console.log(Notes)
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