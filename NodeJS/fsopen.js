//to delete a file
var fs = require('fs');
fs.open('neww.html', 'w', function (err, file) {
  if (err) throw err;
  console.log('Saved!');
});