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
			//data.roomname에 들어있는 소켓들에게 이벤트 발생시키기(자신은제외)
			socket.broadcast.to(data.roomname).emit('join',
					{nickname:data.nickname});
		});
		socket.on('sendMsg',function(data){
			//data.roomname에 들어있는 소켓들에게 이벤트 발생시키기(자신도 포함)
			io.to(data.roomname).emit('recMsg',data);
		});
		socket.on('leaveRoom',function(data){
			io.to(data.roomname).emit('leaveRoom',data);
			//방의 참석자 명단에서 닉네임 삭제하기
			chat.removeAttendants(data.roomname, data.nickname);
			//입장한 방에서 나가기
			socket.leave(data.roomname);
			socket.disconnect();
		});
	});
};
module.exports=chatServer;









