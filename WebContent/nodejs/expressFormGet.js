/**
 * 
 */

var exp=require('express');

var app=exp();

app.get('/expressFormGet',function(req,res) {
	
	console.log('will load express form will be loaded');
	res.sendFile(__dirname+"/"+"expressFormGet.html");
	console.log('after sending');
	//__dirname is case sensetive
	
});


app.get('/post/submitform',function(req,res){
	
	console.log('submit form started');
	//for psot method use param
	//for get method use query
	var u=req.query.userId;
	var e=req.query.emailId;
	var qu=req.query;
	
	console.log('qu answere='+qu);
	console.log(qu);
	
	console.log(u);
	console.log(e);
	//res.send('userid='+e+'  emailid='+e);
	
	/*
	 * only 1 send should be there
	 * submit form started
kk
lll
Error: Can't set headers after they are sent.
    at ServerResponse.OutgoingMessage.setHeader (_http_outgoing.js:357:11)
    at ServerResponse.header (C:\tps\tpsworkspace\zRamizRestWebWork\WebContent\node_modules\exp
s\lib\response.js:730:10)
    at ServerResponse.send (C:\tps\tpsworkspace\zRamizRestWebWork\WebContent\node_modules\expre
lib\response.js:170:12)
    at C:\tps\tpsworkspace\zRamizRestWebWork\WebContent\nodejs\expressFormGet.js:38:6
    at Layer.handle [as handle_request] (C:\tps\tpsworkspace\zRamizRestWebWork\WebContent\node_
ules\express\lib\router\layer.js:95:5)
	 */
	
	var jsonrspnsk={
		firstName:u,
		Email:e
	};
	
	res.send('userid='+e+'  emailid='+e+JSON.stringify(jsonrspnsk));

});



app.listen(9011,function(req,res) {
	
	console.log('server started');
	
});
