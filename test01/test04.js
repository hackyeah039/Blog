/**
 * test04.js
 * 
 * 즉시실행함수 - 함수를 정의함과 동시에 자동으로 수행
 * (함수를 정의하면서 1번만 호출할때 사용)
 */
function func1(){
	console.log('hello');
}
func1();

(function func2(){
    console.log('반가워요');
})();

function func3(msg){
    console.log(msg);
}
func3('홍길동3');

(function(msg){
    console.log(msg);
})('홍길동44');

var s=(function sum(){
    var tot=0;
    return function(n){
        tot+=n;
        return tot;
    }
})();
//var s=sum();
var n1=s(100);
console.log(n1);