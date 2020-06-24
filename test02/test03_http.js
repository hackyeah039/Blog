
var http=require('http');
var fs= require('fs');
var server=http.createServer(function(req,resp){
    fs.readFile('test02/hello.jsp','utf-8',function(err,data){
         if(err){
            console.log('err :'+err);
         }else{
            resp.writeHead(200,{'Content-Type':'text/html'});
            resp.write(data);
            resp.end();
         }
    })
});
server.listen(4000,function(){
    console.log('serverStart! (4000)')
})