/**
 * 
 */

console.log('write date js');

var ht=require('http');
//path for js
//firstModule.js is used
var dtl=require('./firstModule');


ht.createServer(function(req,res){
	res.writeHead(200,{'Content-Type':'text/html'});
	res.write('Date time will be displayed in browser='+dtl.myDataDisplay());
	res.write('<br/>');
	res.write('another message in browser');
	res.end();
	
	
}).listen(9010);