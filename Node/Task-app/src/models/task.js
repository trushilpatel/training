let mongoose = require('mongoose')


const TaskSchema = mongoose.Schema(
  {
    description: {
      type: String,
      required: true
    },
    completed: {
      type: Boolean,
      default: false
    },
    owner: {
      type: mongoose.Schema.Types.ObjectId,
      required: true,
      ref: 'User'
    }
  }, {
  timestamps: true
})

const Task = mongoose.model('Tasks', TaskSchema )
module.exports = Task;