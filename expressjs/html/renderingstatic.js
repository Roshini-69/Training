var express= require("express")
var app=express()
app.use(express.static("publichtml"))
app.set("view enjine","ejs")
app.listen(3500)