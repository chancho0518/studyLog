package interfaceexam.exercise;

import interfaceexam.model.Connection;
import interfaceexam.model.MSSQLDriver;
import interfaceexam.model.MySQLDriver;
import interfaceexam.model.OracleDriver;

public class DatabaseConnection {
	public static void main(String[] args) {
		// Oracle DB 접속
		Connection conn = new OracleDriver();
		
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String oracleID = "system";
		String oraclePW = "manager";
		
		conn.getConnection(oracleUrl, oracleID, oraclePW);
		
		// MySQL DB 접속
		conn = new MySQLDriver();
		
		String mysqlUrl = "jdbc:mysql://localhost:3306/test";
		String mysqlID = "root";
		String mysqlPW = "12345";
		
		conn.getConnection(mysqlUrl, mysqlID, mysqlPW);
		
		// MSSQL DB 접속
		conn = new MSSQLDriver();
		
		String mssqlUrl = "jdbc:sqlserver://localhost:1433;databaseName=mem";
		String mssqlID = "sa";
		String mssqlPW = "12345";
		
		conn.getConnection(mssqlUrl, mssqlID, mssqlPW);
	}
	
}
