package test02.di;

public class MembersDao {
	private String user;//���Ӱ���(scott)
	private String pwd;//���Ӻ�й�ȣ(tiger)
	public MembersDao(String user,String pwd) {
		this.user=user;
		this.pwd=pwd;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void insert(String data) {
		System.out.println(data +" �߰��Ϸ�!");
	}
	public void delete(String data) {
		System.out.println(data +" �����Ϸ�!");
	}
	public void update(String data) {
		System.out.println(data +" �����Ϸ�!");
	}
	public void select(String data) {
		System.out.println(data +" ��ȸ�Ϸ�!");
	}
	
}
