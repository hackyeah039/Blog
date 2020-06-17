package test04.quiz;

public class MyController {//컨트롤러가 JDBCDao에 의존한다.
	private CommonDao dao;//얘를 상속받은 자식클래스를 다 ~ 받겠다는 뜻(조금더 유연하게)
	public void setDao(CommonDao dao) {//어디서 생성된걸 게터세터에 주입한다.
		this.dao=dao; //의존성 주입(여기서 dao에 관한 의존성이높은상태에서 주입을 하는걸 말함)
	}
	public void service() {
		System.out.println("DB서버정보 :" +dao.getDbserver());
		dao.insert("추가요");
		dao.update("수정이요");
		dao.select("조회요");
		dao.delete("삭제요");
	}
}
