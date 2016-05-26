var express = require('express')
,   app = express()
,   server = require('http').createServer(app)
,   io = require('socket.io').listen(server)
,   conf = require('./config.json');



 var spawn = require('child_process').spawn
     var program = "./app";

    var child = spawn(program, []);



child.stdout.on('data', function(data) {
  console.log(`stdout: ${data}`);

  if(data.indexOf("received message of typeM1AccessDenied_M1_Message") != -1){
    io.sockets.emit('deny');
    console.log("Send deny to clients");
  }

  if(data.indexOf("received message of typeM1AccessGranted_M1_Message") != -1){
    io.sockets.emit('granted');
    console.log("Send Granted to clients");
  }

});


child.stderr.on('data', function(data) {
  console.log(`stdout: ${data}`);
});

child.on('close', function(data) {
  console.log(`stdout: ${data}`);
});








// Webserver
// auf den Port x schalten
server.listen(conf.port);

  // statische Dateien ausliefern
 app.use(express.static(__dirname + '/public'));


// wenn der Pfad / aufgerufen wird
app.get('/', function (req, res) {
  // so wird die Datei index.html ausgegeben
  res.sendfile(__dirname + '/public/index.html');
});

// Websocket
io.on('connection', function (socket) {
  console.log("connected");
  // der Client ist verbunden
  socket.emit('chat', { zeit: new Date(), text: 'Du bist nun mit dem Server verbunden!' });


  // wenn ein Benutzer einen Text senden
  socket.on('chat', function (data) {
    // so wird dieser Text an alle anderen Benutzer gesendet
  //  console.log("empafngen"+data.text);

  //write the value to the programm
  var under = parseInt(data.text);
    console.log("Empfangen: "+under);

    child.stdin.setEncoding('utf-8');
    child.stdin.write(under+'\n');
   // io.emit('chat', { zeit: new Date(), name: data.name || 'Anonym', text: data.text });
  });


    socket.on('disconnect', function () {
        console.log('diconnected! ');
    });


});

// Portnummer in die Konsole schreiben
console.log('Der Server läuft nun unter http://127.0.0.1:' + conf.port + '/');
