/**
 *  test js using node file
 */


console.log('node js started');


var httpr=require('http');

httpr.createServer(function(req,res)
{
	console.log('under function');
	res.writeHead(200, {'Content-Type': 'text/plain'});
	res.end('first success message of node js coming');


}).listen(9003);

console.log('node js application tweaked.node js is loading');