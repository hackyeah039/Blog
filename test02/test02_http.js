/**
 * http모듈
 */
//웹서버 생성하기
var http =require('http');
var server= http.createServer(function(request,response){
    //html로 응답하기
    response.writeHead(200,{'Content-Type':'text/html'}); //writeHead 200은 정상적으로 응답, html로 타입을 정하겠다.
    response.write('<h1>Hello nodejs</h1>')
    response.end();
});
//웹서버 실행하기
server.listen(3000,function(){
    console.log('server start!(port:3000)');
}) 