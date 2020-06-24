/**
 * student.js
 */
var student={
	setData:function(num,kor,eng,math){
		this.num=num;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	},
	getTot:function(){
		return this.kor+this.eng+this.math;
	},
	printData:function(){
		console.log('번호:' + this.num);
		console.log('국어:' + this.kor);
		console.log('영어:' + this.eng);
		console.log('수학:' + this.math);
		console.log('총점:' + this.getTot());
	}
};
module.exports=student;