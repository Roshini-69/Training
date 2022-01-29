var http=require('http');
var event = {
    name: "Birthday party", 
    guestlist:["prasad", "Bharathi", "Divya"]
    }

const tasks = {
    tasks: [{
        text: 'shopping',
        completed: true
    }, {
        text: 'payments',
        completed: false
    }, {
        text: 'cleaning',
        completed: false
    }],

    getTasksToDo() {
        return this.tasks.filter( (task) => task.completed === false)
    }
}
console.log(tasks.getTasksToDo())

http.createServer(function (req, res) {
    res.writeHead(200, {'Content-Type': 'text/html'})
    res.write("Guest list for"+ event.name + '<br/>')
    event.guestlist.forEach( (guest) => {
        res.write(guest.toLocaleUpperCase()+"," + '<br/>')})
    res.write("are attending "+event.name);
    res.end()
}).listen(8010)


