document.querySelector("#submitNote").addEventListener(
  "click", function () {

    let note = {}
    note.date = document.querySelector("#insertNoteDate").value;
    note.text = document.querySelector("#insertNoteTextarea").value;

    saveNote(note)
  }
)

