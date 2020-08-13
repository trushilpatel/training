const sgMail = require('@sendgrid/mail')

sgMail.setApiKey(process.env.SEND_GRID_API)



async function welcomeMessage(name, email) {
  sgMail.send({
    to: "python.my.project@gmail.com",
    from: "python.my.project@gmail.com",
    subject: `Welcome to Task Manager ${name}`,
    text: "Have a nice day",
    html: "<h1>કેમ છો મજામાં?</h1>"
  })
}

async function goodByeMessage(name, email) {
  sgMail.send({
    to: "python.my.project@gmail.com",
    from: "python.my.project@gmail.com",
    subject: `Good by ${name}`,
    html: "<h1>ફરી મળી શું...</h1>"
  })
}


module.exports = {welcomeMessage, goodByeMessage}