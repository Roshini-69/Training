const express = require('express');
const path = require('path');

const app = express();

app.set('view engine','ejs');
app.get("/",(req,res)=>
{
    res.render("code");
})
app.listen(3000, () => console.log('Application is running on'));