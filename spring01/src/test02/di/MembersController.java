package test02.di;

public class MembersController {
	private MembersDao dao;
	//�������� �������� dao�� ���Թޱ� ���� setter�޼ҵ� �����
	public void setDao(MembersDao dao) {
		this.dao = dao;
	}
	public void service() {
		System.out.println("<<db��������>>");
		System.out.println("���Ӱ��� :"+dao.getUser());
		System.out.println("������й�ȣ :" + dao.getPwd());
		dao.insert("�̱浿");
		dao.insert("�ֱ浿");
		dao.insert("��浿");
		dao.insert("��浿");
	}
}
