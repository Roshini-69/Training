var express = require('express');
var app = express();

app.get('/:id', function(req, res){
   res.send('The id you specified is ' + req.params.id);
});
app.listen(3010);



app.get('/things/:name/:id', function(req, res) {
   res.send('id: ' + req.params.id + ' and name: ' + req.params.name);
});
app.listen(3000);

//pattern based url 
app.get('/patt/:id([0-9]{5})', function(req, res){
    res.send('id: ' + req.params.id);
 });
 
 //app.listen(3020);

 app.get('*', function(req, res){
    res.send('Sorry, this is an invalid URL.');
 });
 app.listen(3020);