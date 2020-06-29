/**
 * http://usejsdoc.org/
 */
//방 생성시-방목록, ..등등 을 객체화 , export로 내보낼거임
var chat={
	users:[],//접속자명단
	rooms:[],//방목록
	addUser:function(nickname){ 
		this.users.push(nickname); //전체 접속자명단
	},
	addRoom:function(roomname){//방만들기
		//빈 접속자명단을 배열로 갖는 방을 방배열에 추가하기
		this.rooms.push({roomname:roomname,attendants:[]}); //방마다, 접속자들
	},
	getRoomList:function(){//방목록 얻어오기
		   //rooms배열에 담긴 roomname값들만 배열로 만들어 리턴
		   //map함수 : 리턴된 값들을 배열에 저장한다.
		//console.log('들어옴');
		var roomnames=this.rooms.map(function(element){
			return element.roomname;
		});
		//console.log('리턴전'+roomnames);
		return roomnames;
	},
	joinRoom:function(roomname,nickname){//방에 입장하기
		//filter함수 :리턴된 값이 true인 값들만 배열에 저장한다.
		var rooms=this.rooms.filter(function(element){
			return roomname===element.roomname;
		});
		rooms[0].attendants.push(nickname);//입장하는 방의 참석자 명단에  nickname추가
	},
	//방 이름을 파라미터로 전달받아 방의 참석자명단(attendants를 리턴하는 메소드)
	getAttendantsList:function(roomname){
	    var rooms=this.rooms.filter(function(element){
		  return roomname===element.roomname; 
	    });
	    return rooms[0].attendants;
	}
}
module.exports=chat;