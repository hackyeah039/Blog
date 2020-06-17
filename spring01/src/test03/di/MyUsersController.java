package test03.di;
/*
 *MyController가 생성될 수 있도록 bean 설정파일을 만들고 main메소드에서 사용해 보세요.  
 * 
*/
public class MyUsersController {
//
	private CommonsDao dao; //부모객체를 넣으면 자식들도 호출 유연하게할수있다.
	public void setDao(CommonsDao dao) {
		this.dao = dao;
	}
	public void service() {
		System.out.println("DB서버정보 : " + dao.getDbserver());
		dao.insert("이길동1");
		dao.update("이길동2");
		dao.delete("이길동3");
		dao.select("이길동4");
	}
	
}
