/**
 * 
 */

console.log('second node js example started');

var ht=require('http');
ht.createServer(function(req,res) {
	
	console.log('loaded create server example');
	 res.writeHead(200, {'Content-Type': 'text/plain'});
	res.end('first message on browser');
	//location of web project js
	//C:\tps\tpsworkspace\zRamizRestWebWork
	//C:\tps\tpsworkspace\zRamizRestWebWork\WebContent\nodejs
	
});

console.log('after creating server');