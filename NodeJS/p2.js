var http=require('http');
const tasks = {
    tasks: [{
        text: 'Grocery shopping',
        completed: true
    }, {
        text: 'Clean yard',
        completed: false
    }, {
        text: 'Film course',
        completed: false
    }],

    getTasksToDo() {
        return this.tasks.filter( (task) => task.completed === false)
    }
}
console.log(tasks.getTasksToDo())
http.createServer(function (req, res) {
   
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(data);
    res.write(tasks.getTasksToDo());
    return res.end();
}).listen(8010);
