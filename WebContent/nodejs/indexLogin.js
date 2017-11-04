/**
 * 
 */

console.log('ramiz js example');


var exp=require('express');

var ap=exp();

ap.use(exp.static('public'));

ap.get('/indexLogin', function(req,res){
	console.log('login page opening');
	res.sendFile(__dirname+"/"+"indexlogin.htm");
	
});

ap.get('/submitlogin',function(req,res){
	 console.log('respons recieved');
	 
	 var userid=req.query.userId;
	 var pwd=req.query.password;
	 
	 console.log('useid='+userid+"  password=s"+pwd);
	 res.end('userid='+userid+" pwd="+pwd);

});

console.log('server creation started');


var server=ap.listen(9013,function(req,res){
	console.log('server started');
});



