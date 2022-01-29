var http = require('http');
var formidable = require('formidable');
var fs = require('fs');

http.createServer(function (req, res) {
  if (req.url == '/uploadfile') {
    var form = new formidable.IncomingForm();
    form.parse(req, function (err, fields, files) {
      var oldpath = files.filetoupload.filepath;
      var newpath = 'C:/Users/saish' + files.filetoupload.originalFilename;
      fs.rename(oldpath, newpath, function (err) {
        if (err) throw err;
        res.write('File uploaded and moved!');
        res.end();
      });

 });

  } else {

    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(`<form action="uploadfile.js" method="post" enctype="multipart/form-data">
   <input type="file" name="filetoupload1"><br>
    <input type="submit">
    </form>`);
    return res.end();
  }
}).listen(8090);