/**
 * 
 */
console.log('event log started');

var evd=require('events');

//event emitter object
var eve=new evd.EventEmitter();


var cnh=function() {
	
	console.log('connection handler');
	eve.emit('data_received_ok');
	
}

evd.on('connection',cnh);

eve.on('data_received_ok',function(){
	
	console.log('data received event success function');
	
});

eve.emit('connection');