/**
 * 
 */
console.log('split query string');

var th=require('http');
var url=require('url');

th.createServer(function(req,res){
	console.log('inside create server');
res.writeHead(200,{'Content-Type':'text/html'});
//query is not method , it is variable
var ql=url.parse(req.url,true).query;

var txt=ql.year+"  "+ql.msg+"   "+ql.datel;

res.end(txt);


}).listen(9012);

//hit below url
//localhost:9012?year=2012&msg=resoibse from query&datel=21

