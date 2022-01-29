var mongoose = require('mongoose');
var express=require('express');
var app=express();
mongoose.connect('mongodb://localhost/newdb');
var personSchema = mongoose.Schema({
    name: String,
    age: Number,
    nationality: String
 });
 var Person = mongoose.model("Person", personSchema);

app.get('/person', function(req, res){
    res.render('person');
});