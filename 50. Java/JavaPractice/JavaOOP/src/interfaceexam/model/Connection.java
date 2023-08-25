package interfaceexam.model;

// interface는 Java에서 제공
public interface Connection {
	
	// Database 연결동작
	public void getConnection(String url, String username, String password);
}
