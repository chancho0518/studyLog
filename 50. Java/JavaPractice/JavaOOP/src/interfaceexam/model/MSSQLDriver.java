package interfaceexam.model;

public class MSSQLDriver implements Connection {
	
	@Override
	public void getConnection(String url, String username, String password) {
		System.out.println(url + " ," + username + " ," + password + " 정보를 통해 MSSQL DB를 접속 시도함!");
	}
}
