var fs=require('fs');
var url=require('url');
var queryString=require('querystring');
var mysql=require('mysql');
var http=require('http');
var ejs=require('ejs')
var client=mysql.createConnection({
    user:'root',
    password:'java1234',
    database:'sample01'
})
var server=http.createServer(function(req,resp){
    var u= url.parse(req.url); 
    var pathName=u.pathname;
    if(pathName==='/'){
        fs.readFile('index.html','utf-8', function(err,data){
            if(err){
                console.log('err : ' +err);
            }else{
                resp.writeHead(200,{'ContentType':'text/html'});
                resp.write(data);
                resp.end();
            }
        })
    }else if(pathName==='/insert'){
    	fs.readFile('insert.html','utf-8',function(err,data){
    		if(err){
    			console.log('err  : '+err);
    		}else{
    			resp.writeHead(200,{'ContentType':'text/html'});
    			resp.write(data);
    			resp.end();
    		}
    	})
    }else if(pathName==='/insertOk'){
    	req.on('data',function(data){
    		var params=queryString.parse(data.toString());
    		var id=params.id;
    		var pwd=params.pwd;
    		var email=params.email;
    		var phone=params.phone;
    		const sql="insert into test values(?,?,?,?,now())";
    		client.query(sql, [id,pwd,email,phone], function(err){
    			let code='fail';
    			if(err){
    				console.log(code);
    			}else{
    				code='success';
    			}
    			fs.readFile('result.ejs','utf8',function(err,data){
                    resp.writeHead(200,{'Content-Type':'text/html'});
                    resp.write(ejs.render(data,{code:code}));
                    resp.end();
    			})
    		})
    	})
    }else if(pathName==='/check'){
    	req.on('data',function(data){
    		var params=queryString.parse(data.toString());
    		var id=params.id;
    		const sql="select * from test where id=?";
    		client.query(sql, [id], function(err,results) {
    			let code='fail';
    			if(err){
    				console.log(code);
    			}
    			fs.readFile('check.ejs','utf8',function(err, data) {
    				resp.writeHead(200,{'Content-Type':'text/html'});
    				resp.write(ejs.render(data,{list:results}));
    				resp.end();
    			});
    		})
    	})
    }
})

server.listen(3100,function(){
    console.log('3100 server Start!');
})
