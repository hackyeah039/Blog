//사용자가 만든 모듈 불러오기
var a=require('./myfunc'); 
// ./는 내가만든것, 안쓰면 내장되어있는것 
a('hello');

//두수를 파라미터로 전달받아 두수합을 구해서 리턴하는 sum함수를 만들고 
//require함수를 사용해서 사용해 보세요.

var b=require('./sumfunc');
b.minus(3,4);
b.sum(5,6);

//student객체를 불러와 사용해 보세요.
var c=require('./mystudent');
c.setData(100,200,300,400);
c.getTot();
c.printData();

//회원아이디,이메일,이름을 저장하고 출력하는 객체 만들고
//사용해 보세요.(생성자 방식)
var d=require('./output');
var e=new d('id','email','name');
e.printInfo();
