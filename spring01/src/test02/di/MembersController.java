package test02.di;

public class MembersController {
	private MembersDao dao;
	//스프링이 생성해준 dao를 주입받기 위해 setter메소드 만들기
	public void setDao(MembersDao dao) {
		this.dao = dao;
	}
	public void service() {
		System.out.println("<<db접속정보>>");
		System.out.println("접속계정 :"+dao.getUser());
		System.out.println("계정비밀번호 :" + dao.getPwd());
		dao.insert("이길동");
		dao.insert("최길동");
		dao.insert("김길동");
		dao.insert("삼길동");
	}
}
