document.querySelector("#submitNote").addEventListener(
  "click", function () {
    let textArea = document.querySelector("#insertNoteTextarea");
    let date = document.querySelector("#insertNoteDate");

    let note = {}

    note.date = document.querySelector("#insertNoteDate").value;
    note.text = textArea.value;
    textArea.value = "";
    date.value = "";


    saveNote(note)
    renderNotes();
  }
)


let showCompleted = true;
document.querySelector("#showHideCompletedNotes").addEventListener("click",
  function () {
    showCompleted = !showCompleted;

    let newStatus = !showCompleted ? "Show Completed" : "Hide Completed";

    document.querySelector("#completedNoteStatus").innerHTML = newStatus;
    console.log("completedNoteStatus : " + newStatus + " " + showCompleted)
    renderNotes(showCompleted = showCompleted);
  })

document.querySelector("#searchText").addEventListener('input',
  function () {
    let searchText = document.getElementById("searchText").value;
    renderNotes(showCompleted = showCompleted,searchText = searchText)
  })