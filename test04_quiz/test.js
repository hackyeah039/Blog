
var fs=require('fs');
var http=require('http');
var url=require('url');
var queryString=require('querystring');
var mysql=require('mysql');
var ejs=require('ejs');
var client=mysql.createConnection({
    user:'root',
    password:'java1234',
    database:'sample01'
})

var server=http.createServer(function(req,resp){
    var u=url.parse(req.url);
    var path=u.pathname
    if(path==='/'){
        fs.readFile('test04_quiz/index.html','utf8',function(err,data){
            resp.writeHead(200,{'Content-Type':'text/html'});
            resp.write(data);
            resp.end();
        })
    }else if(path==='/insert'){
        fs.readFile('test04_quiz/insert.html','utf8',function(err,data){
            resp.writeHead(200,{'Content-Type':'text/html'});
            resp.write(data);
            resp.end();
        })
    }else if(path==='/insertOk'){
        req.on('data',function(data){
            var params=queryString.parse(data.toString());
            let id=params.id;
            let pwd=params.pwd;
            let email=params.email;
            const sql="insert into users values(?,?,?)";
            client.query(sql,[id,pwd,email],function(err){
                let code='fail';
                if(err){
                    console.log('err : '+ err);
                    return code;
                }else{
                    code='success';
                }
                fs.readFile('test04_quiz/index.html','utf8',function(err,data){
                    resp.writeHead(200,{'Content-Type':'text/html'});
                    resp.write(ejs.render(data,{code:code}));
                    resp.end();
                })
            })
        })
    }else if(path==='/list'){
        const sql="select id,pwd,email from users";
        client.query(sql,function(err,results){
            fs.readFile('test04_quiz/list.ejs','utf8',function(err,data){
                resp.writeHead(200,{'Content-Type':'text/html'});
                resp.write(ejs.render(data,{list:results}));
                resp.end();
            })
        })
    }else if(path==='/delete'){
        let query=u.query;
        const params=queryString.parse(query);
        var id=params.id;
        const sql="delete from users where id=?";
        client.query(sql,[id],function(err){
            if(err){
                console.log('err : '+err );
            }else{
                resp.writeHead(302,{'Location':'/list'})
                resp.end();
            }
        })
    }else if(path==='/update'){
        let qu=u.query;
        const params=queryString.parse(qu);
        var id=params.id;
        fs.readFile('test04_quiz/update.html','utf8',function(err,data){
            resp.writeHead(200,{'Content-Type':'text/html'});
            resp.write(ejs.render(data,{id:id}));
            resp.end();
        })
    }else if(path==='/updateOk'){
        req.on('data',function(data){
            var params=queryString.parse(data.toString());
            let id=params.id;
            let pwd=params.pwd;
            let email=params.email;
            const sql="update users set pwd=?,email=? where id=?";
            client.query(sql,[pwd,email,id],function(err){
                if(err){
                    console.log('err : '+err);
                }else{
                    resp.writeHead(302,{'Location':'/list'})
                    resp.end();
                }
            })
        })
    }
})

server.listen(4130,function(){
    console.log('4130 server start!')
})