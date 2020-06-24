//학생번호,국어,영어,수학점수를 생성자 매개변수로 전달받아 
//총점/평균/출력하는 메소드를 추가하고 사용해 보세요.

function Member1(num,kor,eng,math){
    this.num=num;
    this.kor=kor;
    this.eng=eng;
    this.math=math;
}
Member1.prototype.getNum=function(){
    return this.num;
}
Member1.prototype.getKor=function(){
    return this.kor;
}
Member1.prototype.getEng=function(){
    return this.eng;
}
Member1.prototype.getMath=function(){
    return this.math;
}
var mem = new Member1("번호","국어점수","영어점수","수학점수");

console.log(mem.getEng() +","+ mem.getMath() +","+ mem.getKor() +","+ mem.getNum());