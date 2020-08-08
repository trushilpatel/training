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
    notes.addNotes(argv)
  }
})


// list notes
yargs.command({
  command: "show",
  describe: "Show Notes",
  handler: notes.showNotes()
})