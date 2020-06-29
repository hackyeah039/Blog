/**
 * chatServer.js
 */
var socket=require('socket.io');
var chat=require('./chat.js');

var chatServer=function(app){
	var io=socket.listen(app);//소켓서버 실행하기
	io.on('connection',function(socket){
		console.log('클라이언트가 접속했어요~');
		socket.on('join',function(data){
			//방에 입장하기
			socket.join(data.roomname);
			//data.roomname에 들어있는 소켓들에게 이벤트 발생시키기(자신은 제외)
			socket.broadcast.to(data.roomname).emit('join',
					{nickname:data.nickname});
		});
		socket.on('send',function(data){
			console.log('받았음')
			socket.broadcast.to(data.msg).emit('send',
					{msg:data.msg})
					console.log('보냈음 ')
		})
	});
};
module.exports=chatServer;









