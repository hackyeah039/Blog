/**
 * test03_closure.js
 * 
 * 클로져함수(closure)
 * - 감춰진 참조를 갖는 함수(하나의 함수가 다른 함수를 암묵적으로 참조)
 * - 클로져를 사용하면 전역변수의 사용을 줄이고 깔끔한 형태의 코드를 유지할
 * 수 있다.
 */
function showMsg(msg){
	console.log(msg);
}
showMsg('hello');
var msg=showMsg;//변수에 함수도 대입가능
msg('hihi~');

var tot=0;
function getTot(n){
	tot += n;
	return tot;
}
var n1=getTot(10);
console.log(tot+ "hi1");
var n2=getTot(20);
console.log(tot +"hi2")
var n3=getTot(30);
console.log(tot +"hi3");
console.log('n3:' + n3);
//클로져함수 사용해 보기
function getTot1(){
	var tot1=0;
	function sum(n){
		tot1+=n;
		return tot1;
	}
	return sum;
}
var a=getTot1();//getTot1함수에서 리턴한 값은 sum함수.a는 sum함수를 참조
var b=a(100);
console.log('a:' + a);


console.log('b:' + b);

var c=a(100);//a함수가 sum함수를 참조하고 sum함수는 지역변수 tot1를 사용하므로
//지역변수이지만 tot1은 메모리상에서 계속 유지된다.
console.log('c:' + c);

var arr=[];
function addArr(n){
	arr.push(n);
	return arr;
}
addArr("홍길동");
var a=addArr("김길동");
console.log(a);
//위의 작업을 클로져를 사용해서 만들어 보세요.
function pushData(){
	var arr=[];
	return function add(n){
		arr.push(n);
		return arr;
	};
}
var d=pushData();
d('바나나');
var e=d('딸기');
console.log(e);
/*
var n=100;
 함수를 호출할때마다 변수값이 1씩감소하여 출력하는 작업을 클로져로 만들고 사용해보세요.
*/

function minus(){
	var n=100;
	return function(){
		console.log('n :'+n--);
	}
}
var z=minus();
console.log('ss')
z;
z;
z;

function print(){
	var n=100;
	return function(){
		console.log('n:' + n--);
	};
}
var f=print();
f();
f();
f();
