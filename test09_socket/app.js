//클라이언트가 접속하면 chat.html페이지 보이기
var http=require('http');
var fs=require('fs');
var socket=require('socket.io'); //npm install socket.io
var server=http.createServer(function(req, res) {
	fs.readFile('chat.html','utf8', function(err, data) {
		res.writeHead(200,{'Content-Type':'text/html'});
		res.write(data);
		res.end();
	});
});
server.listen(3000,function(){
	console.log('server start!');
});
var io=socket.listen(server);//소켓서버 실행하기
io.on('connection',function(socket){ //connection은 이미정해져있는 이벤트
	console.log('클라이언트가 접속했어요~');
	socket.on('sendMsg',function(data){
		console.log(data.nickname +" ,"+data.msg);
		io.sockets.emit('recMsg',data);
	})
	socket.on('exit',function(data){
		io.sockets.emit('resexit',{resmsg:data.nickname+'님이 나가셨습니다.'});
	})
});
