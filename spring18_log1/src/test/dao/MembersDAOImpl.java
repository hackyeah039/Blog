package test.dao;

public class MembersDAOImpl implements MembersDAO{
	@Override
	public int insert(Object data) {
		System.out.println(data +"�߰��Ϸ�!");
		return 1;
	}
	@Override
	public int delete(Object data) {
		System.out.println(data +"�����Ϸ�!");
		return 1;
	}
	@Override
	public int update(Object data) {
		System.out.println(data +"�����Ϸ�!");
		return 1;
	}
	@Override
	public Object select(Object data) {
		System.out.println(data +"��ȸ �Ϸ�!");
		return data;
	}
}
