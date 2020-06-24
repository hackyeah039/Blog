/**
 * test01_file.js
 * 
 * 
 */
//저장파일명,내용,콜백함수
var fs=require('fs');
fs.writeFile('test.txt','hello nodejs!',function(err){
    if(err){
        console.log('error : '+err);
    }else{
        console.log('파일로 저장완료!')
    }
});
//저장된 파일 읽어오기
//파일명,인코딩방식, 콜백함수
console.log('d')
fs.readFile('test.txt','utf-8',function(err,data){
    if(err){
        console.log('err :'+err);
    }else{
        console.log(data);
    }
})