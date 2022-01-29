var http=require('http');
var dt=require('./firstmodule');   //using the function created in first module
http.createServer(function(req,res)
{
    res.writeHead(200,{'Content-Type':'text/html'});
    res.write("current date and time "+dt.myDateTime()); //calling function using dt object
    res.end();
}).listen(8010);





