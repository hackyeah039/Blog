/**
 * app3.js
 * 
 * 
 * 라우팅                컨트롤러에 해당 매핑경로를 주면 요청수행하는것 ==라우터, 컨트롤러와 비슷 app가 할일이 많아서 일을 분리한것 app는 톰캣같은것,요청응답에 관련되어있는것
 *  -클라이언트 url 요청에 대한 응답방식을 설정
 *  -라우터 : 요청을 식별해서 요청을 수행 // db받아서 처리하는것
 * 
 * 미들웨어
 *  -어플리케이션에 대한 http요청에 동작하는 기능을 캡슐화하는 방법 
 * //보이지않게 처리하는것 =캡슐화 ,, jsp  의  filter와 비슷, 클라이언트가 요청하면 controller ,servlet 이든 가기전에 필터가 처리하는건데 
 * //이거와 굉장히 유사한게 미들웨어, 
 * 
 * //클라이언트가 요청하면 라우터들로 가는데 그곳에 가기전에 미들웨어가 실행됨
 *  -미들웨어는 요청객체, 응답객체,next함수를 매개변수로 받는 함수이다.
 *  -app.use함수를 사용해서 미들웨어를 삽입한다. 
 */
//라우터=직접만들기, 미들웨어=이미 만들어진 모듈이많음 삽입만 ㅇㅇ
var express= require('express');
var app=express();
var routerA=express.Router();//라우터 생성하기
var routerB=express.Router();//라우터 생성

app.use(function(req,resp,next){
    console.log(' 미들웨어1 수행!!')
    next();//다음 미들웨어가 있으면 수행하고 없으면 요청에 따른 라우터를 수행함 //얘를 호출안하면 뒤로안넘어감
});
routerB.get('/Bindex',function(req,resp){
    resp.send('<h1>Bindex</h1>')
})
routerB.get('/second',function(req,resp){
    resp.send('<h1>secondOne</h1>');
})
app.use(function(req,resp,next){
    console.log('미들웨어 2수행 !!!')
    next();
})
routerA.get('/index',function(req,resp){
    resp.send('<h1>RouterA!</h1>')
});
routerA.get('/hello',function(req,resp){
    resp.send('<h1>RouterA ! Hello! </h1>');
})
app.use('/a',routerA);// /a경로로 요청이 들어오면 routerA수행해라.
app.use('/b',routerB);
app.listen(3003,function(){
    console.log('server start!(3003)');
})