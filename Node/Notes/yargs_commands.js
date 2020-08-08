let yargs = require("yargs");
let notes = require("./notes")

// add notes
yargs.command({
  command: "add",
  describe: "Insert note",
  builder: {
    title: {
      description: "Note title",
      demandOption: true,
      type: 'string'
    }
  },
  handler(args) {
    notes.addNotes(yargs.argv)
  }
})

// list notes
yargs.command({
  command: "show",
  describe: "Show Notes",
  handler() {
    notes.showNotes()
  }
})

// delete note
yargs.command({
  command: "delete",
  describe: "Insert note",
  builder: {
    title: {
      description: "Delete Notes",
      demandOption: true,
      type: 'string'
    }
  },
  handler() {
    notes.deleteNote(yargs.argv)
  }
})

yargs.argv