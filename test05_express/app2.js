/**
 * 
 *  app2.js
 * 
 */
var express=require('express');
var app=express();
app.set('view engine','jade');// 뷰페이지를 jade로 사용함
app.set('views','./views'); //뷰페이지가 있는 폴더 설정
app.get('/',function(req,resp){
    resp.render('index');//index.jade로 응답하기
})
app.get('/join',function(req,resp){
	resp.render('join');
});
//가입버튼을 누르면 회원가입성공! 이라고 출력되도록 해보세요
app.post('/joinOk',function(req,resp){
    resp.render('joinOk')
})
app.listen(3003,function(){
    console.log('server start!(3003)');
})









