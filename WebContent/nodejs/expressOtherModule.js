/**
 * 
 */

console.log('express module js started');


var exp=require('express');


var app=exp();


app.get('/',function(req,res){
	
	console.log('callback function strted');
	res.send('Hello world example from express module');
	
});

app.get('/listUser',function(req,res){
	console.log('list ureser started');
	res.send('listUser response started for usere');
	
});

app.post('/SubmitForm',function(req,res){
	console.log('submt form stareed');
	var userid=req.param('userId');
	var email=req.param('useremail');
	
	console.log('userid='+userid);
	console.log(email);
	
});







var serv=app.listen(9011,function(req,res){
	var host=serv.address().address;
	var port=serv.address().port;
	
	console.log('host='+host+" port="+port);
	
});


