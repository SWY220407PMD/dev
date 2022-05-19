package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) throws Exception {
		
		/*
		 * <java 랑 DB 연결 : Connection 얻기>

			2. 연결(Connection) 얻기
			url,id,pwd 등등 이용해서 연결 얻기
			DriverManager.getConnection(..);
			
			확인방법 : 출력문으로 Connection 객체 출력해보기
		 * */
		
		//드라이버 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "C##KH";
		String pwd = "KH";
		
		Connection c = DriverManager.getConnection(url, id, pwd);
		
		System.out.println(c);

	}

}//class













