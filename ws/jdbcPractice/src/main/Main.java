package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) throws Exception {
		
		/*
		 * <java �� DB ���� : Connection ���>

			2. ����(Connection) ���
			url,id,pwd ��� �̿��ؼ� ���� ���
			DriverManager.getConnection(..);
			
			Ȯ�ι�� : ��¹����� Connection ��ü ����غ���
		 * */
		
		//����̹� ���
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "C##KH";
		String pwd = "KH";
		
		Connection c = DriverManager.getConnection(url, id, pwd);
		
		System.out.println(c);

	}

}//class













