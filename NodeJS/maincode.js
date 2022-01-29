var fs = require('fs');
var http = require('http');
fs.writeFile('code.html','todo', 
function (err) {if (err) throw err; console.log('Saved!');});
http.createServer(function (req, res) {
  
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(data);
    return res.end();
  }).listen(8010);