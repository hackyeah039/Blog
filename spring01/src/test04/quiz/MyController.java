package test04.quiz;

public class MyController {//��Ʈ�ѷ��� JDBCDao�� �����Ѵ�.
	private CommonDao dao;//�긦 ��ӹ��� �ڽ�Ŭ������ �� ~ �ްڴٴ� ��(���ݴ� �����ϰ�)
	public void setDao(CommonDao dao) {//��� �����Ȱ� ���ͼ��Ϳ� �����Ѵ�.
		this.dao=dao; //������ ����(���⼭ dao�� ���� �������̳������¿��� ������ �ϴ°� ����)
	}
	public void service() {
		System.out.println("DB�������� :" +dao.getDbserver());
		dao.insert("�߰���");
		dao.update("�����̿�");
		dao.select("��ȸ��");
		dao.delete("������");
	}
}
