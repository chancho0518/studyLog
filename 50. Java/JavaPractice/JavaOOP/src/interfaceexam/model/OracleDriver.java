package interfaceexam.model;

// OracleDriver는 Oracle에서 제작하여 배포(Driver)
public class OracleDriver implements Connection {

	@Override
	public void getConnection(String url, String username, String password) {
		System.out.println(url + " ," + username + " ," + password + " 정보를 통해 Oracle DB를 접속 시도함!");
	}
}
