package test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	private OracleDao oracleDao;
	@Autowired
	private MySqlDao mySqldao;
	
	public void setOracleDao(OracleDao oracleDao) {
		this.oracleDao = oracleDao;
	}
	public void setMySqldao(MySqlDao mySqldao) {
		this.mySqldao = mySqldao;
	}
	public void insert(String data) {
		oracleDao.insert(data);
		mySqldao.insert(data);
	}
	public void delete(String data) {
		oracleDao.insert(data);
		mySqldao.insert(data);
	}
	public void update(String data) {
		oracleDao.insert(data);
		mySqldao.insert(data);
	}
}
