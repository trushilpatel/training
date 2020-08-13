let express = require('express')
let TaskDAO = require('../services/dao/task-dao')
let { auth } = require('../services/middleware/auth')
let insertOwner = require('../services/utils/Task/insertOwner')
const Task = require('../models/task')


let router = express.Router()

router.get('/', auth, async function (req, res) {
  res.json(await TaskDAO.getAllTask())
})

router.get('/:id', auth, async function (req, res) {
  let tasks = await TaskDAO.getTask(req.params.id)
  await tasks.populate('owner').execPopulate()
  res.json(tasks)
})

router.post('/', auth, insertOwner, async function (req, res) {
  res.json(await TaskDAO.insertTask(req.body))
})

router.patch('/', auth, insertOwner, async function (req, res) {
  res.json(await TaskDAO.updateTask(req.body))
})

router.delete('/:id', auth, async function (req, res) {
  let id = req.params.id
  res.send(await TaskDAO.deleteTask(id))
})

router.all('*', auth, function (req, res) {
  res.send("Something is wrong in User-router")
})


module.exports = router;