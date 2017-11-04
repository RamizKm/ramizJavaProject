/**
 * 
 */

console.log('node event listener started');

var et=require('events');

var emtret=new et.EventEmitter();

var listn1=function() {
	console.log('first listener started');
	
	
}

var listsec=function() {
	
	console.log('second event started');
	//alert is not defined it gives error.ReferenceError: alert is not defined
//	alert('alert msg from second event');
	
}

emtret.addListener('connection',listn1);

emtret.addListener('connection',listsec);

//it will invoke listeners when emit function is called
emtret.emit('connection');

console.log('evnet listener js ended');
