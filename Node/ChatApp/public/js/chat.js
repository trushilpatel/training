const socket = io()

// Elements
const $messageForm = document.querySelector('#message-form')
const $messageFormInput = $messageForm.querySelector('input')
const $messageFormButton = $messageForm.querySelector('button')
const $sendLocationButton = document.querySelector('#send-location')
const $messages = document.querySelector('#messages')

// Templates
const messageTemplate = document.querySelector('#message-template').innerHTML
const locationMessageTemplate = document.querySelector('#location-message-template').innerHTML

// Username Room
let { username, room } = Qs.parse(location.search, { ignoreQueryPrefix: true })
console.log(username, room)

socket.on('message', (userData) => {
  console.log("UserData : ")
  if (userData.text) {


    const html = Mustache.render(messageTemplate, {
      username: userData.username,
      message: userData.text,
      createdAt: moment(userData.createdAt).format('h:mm a')
    })
    $messages.insertAdjacentHTML('beforeend', html)
  }
})

socket.on('locationMessage', (message) => {
  console.log(message)
  const html = Mustache.render(locationMessageTemplate, {
    url: message.url,
    createdAt: moment(message.createdAt).format('h:mm a')
  })
  $messages.insertAdjacentHTML('beforeend', html)
})

$messageForm.addEventListener('submit', (e) => {
  e.preventDefault()


  let message = e.target.elements.message.value
  message = message.trim()

  if (message != '') {
    $messageFormButton.setAttribute('disabled', 'disabled')

    const html = Mustache.render(messageTemplate, {
      username: username,
      message: message,
      createdAt: moment().format('h:mm a')
    })

    $messages.insertAdjacentHTML('beforeend', html)

    socket.emit('sendMessage', { username, text: message, room: room }, (error) => {
      $messageFormButton.removeAttribute('disabled')
      $messageFormInput.value = ''
      $messageFormInput.focus()

      if (error) {
        return console.log(error)
      }

      console.log('Message delivered!')
    })


  }
})

window.onbeforeunload = function () {
  socket.emit('disconnect', { username, room })
  alert("are you sure")
}

$sendLocationButton.addEventListener('click', () => {
  if (!navigator.geolocation) {
    return alert('Geolocation is not supported by your browser.')
  }

  $sendLocationButton.setAttribute('disabled', 'disabled')

  navigator.geolocation.getCurrentPosition((position) => {
    socket.emit('sendLocation', {
      latitude: position.coords.latitude,
      longitude: position.coords.longitude
    }, () => {
      $sendLocationButton.removeAttribute('disabled')
      console.log('Location shared!')
    })
  })
})

socket.emit('join', { username, room })