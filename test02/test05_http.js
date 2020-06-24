/**
 * test05_http.js
 */
var http=require('http');
var fs=require('fs');
var ejs=require('ejs');
var quertystring=require('querystring'); 
var url=require('url');
var server=http.createServer(function(req,resp){
    var u=url.parse(req.url);//pathName,queryString을 뽑아올수있음 ,url 에서
    var path=u.pathname;
    if(path==='/'){
        fs.readFile('test02/index.html','utf-8',function(err,data){
            if(err){
                console.log('err : '+err);
            }else{
                resp.writeHead(200,{'Content-Type' : 'text/html'});
                resp.write(data);
                resp.end();
            }
        });
    }else if(path==='/insert'){
        fs.readFile('test02/insert.html','utf-8',function(err,data){
            if(err){
                console.log('err : '+err);
            }else{
                resp.writeHead(200,{'Content-Type':'text/html'});
                resp.write(data);
                resp.end();
            }
        });
    }else if(path==='/insertOk'){
        //post방식으로 요청시 전송된 파라미터가 존재하면  data이벤트가 발생됨
        req.on('data',function(data){ //node에서는 데이터를 받았다는 이벤트 줬다는 이벤트 성립 가능///전송된 정보가 함수 파라미터로 들어오면 
            var param=quertystring.parse(data.toString());//쿼리스트링 모듈을 가져와서 파라미터변수에 할당
            var name=param.name;
            var phone=param.phone;
            var addr=param.addr;
            fs.writeFile('test02/result.ejs','utf-8',function(err,data){
                if(err){
                    console.log('err : '+err);
                }else{
                    fs.readFile('test02/result.ejs','utf-8',function(err,data){
                        if(err){
                            console.log('err : '+err);
                        }else{
                            resp.writeHead(200,{'Content-Type':'text/html'});
                            resp.write(ejs.render(data,{name:name,phone:phone,addr:addr}))
                            resp.end();
                        }
                    })
                }
            })
        });
    }
})
server.listen(4500,function(){
    console.log('server start! 4500');
})