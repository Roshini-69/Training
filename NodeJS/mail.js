var nodemailer = require('nodemailer');

var transporter = nodemailer.createTransport({
  service: 'gmail',
  auth: {
    user: 'roshinilakshmib@gmail.com',
    pass: 'vqzduehddnaxflxa'
  }
});

var mailOptions = {
  from: 'roshinilakshmib@gmail.com',
  to: 'bharathijavvadi2001@gmail.com',
  subject: 'Sending Email using Node.js',
  text: 'idhigo.....bharre!'
};

transporter.sendMail(mailOptions, function(error, info){
  if (error) {
    console.log(error);
  } else {
    console.log('Email sent: ' + info.response);
  }
});