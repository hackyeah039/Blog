/**
 * test04.js
 */
//test01.ejs파일로 응답하는 코드 작성해 보세요.
var http=require('http');
var fs=require('fs');
var ejs=require('ejs');
var server=http.createServer(function(req,resp){
    fs.readFile('test02/test01.ejs','utf-8',function(err,data){
        if(err){
            console.log('err : '+err);
        }else{
            resp.writeHead(200,{'Content-Type':'text/html'});
            //resp.write(data);
            resp.write(ejs.render(data,{id:'test',pwd:'1234'}))
            resp.end();
        }
    })
});

server.listen(4000,function(){
    console.log('server start!');
})