/**
 * chat.js
 */
var chat={
   users:[],//접속자 명단
   rooms:[],//방목록
   addUser:function(nickname){//전체 접속자명단에 nickname추가하기
	   this.users.push(nickname);
   },
   addRoom:function(roomname){//방만들기
	   //빈 접속자명단을 배열로 갖는 방을 방배열에 추가하기
	   this.rooms.push({roomname:roomname,attendants:[]});
   },
   getRoomList:function(){//방목록 얻어오기
	   //rooms배열에 담긴 roomname값들만 배열로 만들어 리턴
	   //map함수 : 리턴된 값들을 배열에 저장한다.
	   var roomnames=this.rooms.map(function(element){
		  return element.roomname; 
	   });
	   return roomnames;
   },
   joinRoom:function(roomname,nickname){//방에 입장하기
	   //filter함수 : 리턴된 값이 true인 값들만 배열에 저장한다.
	   var rooms=this.rooms.filter(function(element){
		  return roomname===element.roomname; 
	   });
	   rooms[0].attendants.push(nickname);//입장하는 방의 참석자 명단에 nickname추가
   },
   //방이름을 파라미터로 전달받아 방의 참석자명단(attendants)를 리턴하는 메소드
   getAttendantsList:function(roomname){
	   var rooms=this.rooms.filter(function(element){
		  return roomname===element.roomname; 
	   });
	   return rooms[0].attendants;
   },
   removeAttendants:function(roomname,nickname){
	   //입장한 방 구하기
	   var rooms=this.rooms.filter(function(element){
		  return roomname===element.roomname; 
	   });
	   //닉네임의 배열 인덱스값 구하기
	   var index=rooms[0].attendants.indexOf(nickname);
	   //방참석자명단에서 닉네임 삭제하기
	   rooms[0].attendants.splice(index,1);
   }
};
module.exports=chat;














