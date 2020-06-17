package test04.quiz;

public interface CommonDao {
	void setDbserver(String dbserver);
	String getDbserver();
	void insert(Object data);
	void update(Object data);
	void delete(Object data);
	void select(Object data);
}
