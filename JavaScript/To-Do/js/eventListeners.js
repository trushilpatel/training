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
let searchText = '';

document.querySelector("#showHideCompletedNotes").addEventListener("click",
  function () {
    showCompleted = !showCompleted;

    newStatus = !showCompleted ? "Show Completed" : "Hide Completed";
    searchText = document.getElementById("searchText").value;

    document.querySelector("#completedNoteStatus").innerHTML = newStatus;
    console.log("completedNoteStatus : " + newStatus + " " + showCompleted)
    renderNotes(showCompleted, searchText);
  })
  
document.querySelector("#searchText").addEventListener('input',
  function () {
    searchText = document.getElementById("searchText").value;
    console.log(searchText)
    renderNotes(showCompleted, searchText)
  })

  function clearSearchText(){
    document.getElementById("searchText").value = '';
    searchText='';
    renderNotes(showCompleted, searchText)
  }