/**
 * app.js
 */
var http=require('http');
var fs=require('fs');
var jade=require('jade');//npm install jade
var server=http.createServer(function(request, response) {
	fs.readFile('test.jade','utf8', function(err, data) {
		var ff=jade.compile(data);//ff는 함수
		response.writeHead(200,{'Content-Type':'text/html'});
		response.write(ff({id:'admin',pwd:'1234'}));//html로 변환해서 응답
		response.end();
	});
});
server.listen(3000,function(){
	console.log('server start!'); 
});
