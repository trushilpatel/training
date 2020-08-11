let express = require('express')
let router = express.Router()
let services = require('./services')

router.get('/', services.getWeatherDetails)

exports.router = router;