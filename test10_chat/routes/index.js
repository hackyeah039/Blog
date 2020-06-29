var express = require('express');
var chat=require('../chat/chat.js');//참석자명단 할려면 불러와야 하니깐 모듈추가
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) { //세션은 리퀘스트 객체에서 사용가능 //전부 라우터에서하면 복잡해서 따로 모듈을 만들거임
  res.render('index', { title: 'Express' }); 
});
router.post('/enter',function(req,res){
	let nickname=req.body.nickname;//파라미터로 전송된 닉네임 받아오기
	req.session.nickname=nickname;//세션에 사용자닉네임 추가하기
	chat.addUser(nickname);//전체 참석자명단에 닉네임추가하기
	//방제목명단 얻어오기
	var roomlist=chat.getRoomList();
	console.log(roomlist);
	res.render('enter',{nickname:nickname,roomlist:roomlist});
});
router.post('/makeroom',function(req,res){
	var nickname=req.session.nickname;
	let roomname=req.body.roomname;
	chat.addRoom(roomname);//방만들기(방이름 추가)
	chat.joinRoom(roomname, nickname);//해당 방에 참석자 명단으로 추가
	var attendants=chat.getAttendantsList(roomname);//방의 참석자 명단얻어오기
	res.render('join',
			{nickname:nickname,roomname:roomname,attendants:attendants});
});
router.get('/join',function(req,res){
		var roomname=req.query.room;
		var nickname=req.session.nickname;
		chat.joinRoom(roomname,nickname);
		var attendants=chat.getAttendantsList(roomname);//참석자명단
		res.render('join',
				{nickname:nickname,roomname:roomname,attendants:attendants});
});
module.exports = router;
