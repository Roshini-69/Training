//to delete files
var fs = require('fs');
fs.unlink('delete.html',function (err){
    if (err) throw err;
    console.log('unlinked file successfully');
});