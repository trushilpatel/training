let express = require('express')
let multer = require('multer')
let UserDAO = require('../services/dao/user-dao')
let User = require('../models/user')
let { isValidToken, auth } = require('../services/middleware/auth')
const formateUserData = require('../services/utils/User/formateUserData')
let sharp = require('sharp')
let {goodByeMessage, welcomeMessage} = require('../emails/account')

let router = express.Router()

const upload = multer({
  limits: {
    fileSize: 1000000
  },
  fileFilter(req, file, cb){

    if (!file.originalname.match(/\.(jpg|jpeg|png)$/)){
      return Error("Please Upload a Photo")
    }
    
    cb(undefined, true)
  }
})


router.post('/upload/avatar', auth, upload.single('upload'), async function (req, res) {
  let user = await User.decodeJWT(req.header('Authorization'))
  let buffer = await sharp(req.file.buffer).resize({height: 300, width: 300}).png().toBuffer()
  user.avatar = buffer
  await user.save()

  res.send()
})

router.get('/avatar', auth, async function( req, res){
  let user = await User.decodeJWT(req.header('Authorization'))
  
  res.set('Content-Type', 'image/png')
  res.send(user.avatar)
})

router.post('/login', async (req, res) => {
  console.log(req.header('Authorization'))
  let validToken = await isValidToken(req.header('Authorization'))

  console.log("/login isValidToken : " + validToken)

  if (validToken) {

    res.send({ loggedIn: "/login Successfully" })

  } else {

    let user = await User.authenticateUser(req.body.email, req.body.password)

    if (user.error) {
      res.send(user)
    } else {
      res.send(await UserDAO.generateAndSaveToken(user))
    }
  }
})


router.post('/logout', auth, async (req, res) => {
  let Authorization = req.header('Authorization')
  await UserDAO.deleteToken(Authorization)
  res.send({ LoggedOut: '/Logout Successfully' })
})


router.post('/logoutAll', auth, async (req, res) => {

  let Authorization = req.header('Authorization')

  await UserDAO.deleteAllToken(Authorization)

  res.send({ LoggedOut: '/LogoutAll Successfully' })
})


router.get('/', auth, async function (req, res) {
  console.log(await UserDAO.getAllUser())
  res.json(await UserDAO.getAllUser())
})


router.get('/tasks', auth, async function (req, res) {
  let completed = req.query.completed
  let tasks = await UserDAO.getAllTasksOfUser(req.header('Authorization'))

  if (completed) {
    tasks = tasks.filter((task) => String(task.completed) === completed)

  }
  res.json(tasks)
})


router.get('/:id', auth, async function (req, res) {
  let user = await UserDAO.getUser(req.params.id)

  res.json(user)
})


router.post('/', async function (req, res) {
  let user = new User(req.body)
  welcomeMessage(user.name, user.email)
  res.send(await UserDAO.insertUser(user.toJSON()))
})


router.patch('/', auth, async function (req, res) {
  res.send(await UserDAO.updateUser(req.body))
})


router.delete('/:id', auth, async function (req, res) {
  let user = User.decodeJWT(req.header('Authorization'))
  goodByeMessage(user.name, user.email)
  res.send(await UserDAO.deleteUser(req.params.id))
})


router.all('*', function (req, res) {
  res.send("Something is wrong in User-router")
})



module.exports = router;