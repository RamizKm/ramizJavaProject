/**
 * 
 */

var exp=require('express');


var app=exp();


app.get('/download',function(req,res){
	
	console.log('callback function example for pdf download');
	res.set('Content-Type', 'text/plain');
	res.download('sampleInput.txt','sampelDownloadFile.txt');
	console.log('after download call');
	//res.send('Hello world example from express module');
	res.end();
	//after wrting res.end() this ends response process.
});

var serv=app.listen(9011,function(req,res){
	var host=serv.address().address;
	var port=serv.address().port;
	
	console.log('host='+host+" port="+port);
	
});

