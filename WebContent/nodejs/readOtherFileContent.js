/**
 * 
 */

console.log('read started');


var fst=require('fs');


fst.readFile('sampleInput.txt','utf8',function(error,text){
	console.log('error started');
	
	if(error) {
		console.log('error has occured');
		throw error;
	}
	
	console.log('file has been read='+text);
	
});