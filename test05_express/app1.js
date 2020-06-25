/**
 * app1.js
 */
var express=require('express');
var app = express();
app.get('/',function(req,resp){//http://localhost:4000
    resp.send('<h1>Hello World!</h1>')
})
app.get('/member',function(req,resp){//http://localhost:4000/member
    resp.send('<h1>회원님 반가워요!</h1>')
})
app.listen(4000,function(){
    console.log('server start!(4000)');
})