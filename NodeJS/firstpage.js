var http = require('http');
var r=require('upper-case');
//create server object
http.createServer(function (req, res)
 {
  res.writeHead(200, {'Content-Type': 'text/plain'}); //status code
  res.write('Rosh');//write a server to client
  res.write(r.upperCase('Rosh'));
  res.end();//end the server
}).listen(8000);//server object listens on port 8000
