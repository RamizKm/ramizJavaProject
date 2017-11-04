/**
 * 
 */

console.log('first module js loaded');

exports.myDataDisplay=function() {
	
	console.log('display date in my display date');
	return Date();
	
}

console.log('it is useed in writeDate.js');