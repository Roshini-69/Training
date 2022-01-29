var fs = require('fs');
var http = require('http');
fs.writeFile('fswrite.html','testing fswriteFile', 
function (err) {if (err) throw err; console.log('Saved!');});
http.createServer(function (req, res) {
    fs.readFile('fswrite.html', function(err, data) {
      res.writeHead(200, {'Content-Type': 'text/html'});
      res.write(data);
      return res.end();
    });

  }).listen(8008);