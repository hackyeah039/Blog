/**
 * app.js
 * 
 * http 서버를 실행하고 클라이언트가 웹브라우져로 접속하면 
 * index.html페이지가 보이도록 해보세요.
 */

 var fs=require('fs');
 var http=require('http');
 var url=require('url');
 var queryString=require('querystring');
 var mysql=require('mysql');//npm install mysql
 var ejs=require('ejs');//npm install ejs
 //mysql 에 접속하기 위한 객체 얻어오기
 var client=mysql.createConnection({
     user:'root',
     password:'java1234',
     database:'sample01'
 })
 var server=http.createServer(function(req,resp){
	console.log('1111');
    var u= url.parse(req.url); 
    var pathName=u.pathname;
    if(pathName==='/'){
        fs.readFile('index.html','utf-8', function(err,data){
            if(err){
                console.log('err : ' +err);
            }else{
                resp.writeHead(200,{'Content-Type':'text/html'});
                resp.write(data);
                resp.end();
            }
        })
    }else if(pathName==='/insert'){
        fs.readFile('insert.html','utf-8',function(err,data){
            if(err){
                console.log('err : '+err);
            }else{
                resp.writeHead(200,{'Content-Type':'text/html'});
                resp.write(data);
                resp.end();
            }
        });
    }else if( pathName==='/insertOk'){
        req.on('data',function(data){
             var params=queryString.parse(data.toString());
             var name=params.name;
             var phone=params.phone;
             var addr=params.addr;
             //db에 사용자정보 저장하기
            const sql="insert into members values(0,?,?,?,now())";
            client.query(sql,[name,phone,addr],function(err){ //sql ? 를 배열로 할당,sql구문이 실행후 처리될 콜백함수
                let code='success';
                //사용자에게 결과응답하기
                if(err){
                    console.log('error : '+err);
                    return code;
                }else{
                    console.log('success');
                }
                fs.readFile('result.ejs','utf8',function(err,data){
                       resp.writeHead(200,{'Content-Type':'text/html'});
                       resp.write(ejs.render(data,{code:code}));
                       resp.end();
                })
            });
        });
    }else if(pathName==='/list'){
		const sql="select num,name,phone,addr,date_format(regdate,'%Y-%m-%d') regdate"+
			
		" from members";
		//select로 조회된 결과값들이 results에 담김
		client.query(sql,function(err,results){
			let code='success';
			if(err){
				code='error';
				console.log('error:' + err);
			}
			fs.readFile('list.ejs','utf8',function(err, data) {
				resp.writeHead(200,{'Content-Type':'text/html'});
				//list.ejs파일에 list라는 이름으로 results보내기
				resp.write(ejs.render(data,{list:results}));
				resp.end();
			});
		});
	}else if(pathName==='/delete'){
		let query=u.query;//url에 붙은 쿼리스트링(/delete?num=1) 일때  num=1이게 u.query에 할당 여러개면 다 붙음
		const param=queryString.parse(query);//한개씩 떼어내는 작업
		let num=param.num;
		const sql="delete from members where num=?";
		client.query(sql,[num],function(err){
			if(err){
				console.log('error : '+err);
			}else{
				//리다이렉트방식으로 응답
				resp.writeHead(302, {'Location':'/list'})
				resp.end();
			}
		})
	}else if(pathName==='/update'){
		let qu=u.query;//전부다 가져오기
        var query=queryString.parse(qu);//한개씩
        let num=query.num;
		fs.readFile('update.ejs','utf-8',function(err,data){
			if(err){
				console.log('err : '+err);
			}else{
				resp.writeHead(200, {'ContentType':'text/html'});
				resp.write(ejs.render(data,{num:num}));
				resp.end();
			}
		})
                
	}else if(pathName==='/updateOk'){
		fs.readFile('update.ejs','utf-8',function(err, data) {
            let qu=u.query;//전부다 가져오기
            var query=queryString.parse(qu);//한개씩
            console.log(qu);
            let num=query.num;
            let name=query.name;
            let phone=query.phone;
            let addr=query.addr;
            const sql1='update members set name=?,phone=?,addr=? where num=?';
            client.query(sql1,[name,phone,addr,num],function(err){
            	if(err){
            		console.log('err : '+err);
            	}else{
            		resp.writeHead(302, {'Location':'/list'})
            		resp.end();
            	}
            })
		})
	}
 });
 server.listen(3000,function(){
     console.log('3000 server Start!');
 }) ;