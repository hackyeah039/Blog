package test03.di;
/*
 *MyController�� ������ �� �ֵ��� bean ���������� ����� main�޼ҵ忡�� ����� ������.  
 * 
*/
public class MyUsersController {
//
	private CommonsDao dao; //�θ�ü�� ������ �ڽĵ鵵 ȣ�� �����ϰ��Ҽ��ִ�.
	public void setDao(CommonsDao dao) {
		this.dao = dao;
	}
	public void service() {
		System.out.println("DB�������� : " + dao.getDbserver());
		dao.insert("�̱浿1");
		dao.update("�̱浿2");
		dao.delete("�̱浿3");
		dao.select("�̱浿4");
	}
	
}
