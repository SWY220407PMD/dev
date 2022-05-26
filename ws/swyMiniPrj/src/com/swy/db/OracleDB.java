package com.swy.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDB {
	
	// Ŀ�ؼ� �������ֱ�
	public static Connection getOracleConnection() {
		
		// ���Ͽ��ٰ�, ip, port, url �̷� ���� �������� ����
		// ���Ͽ��� �о���� ����
		// �翬��, ������ ���� ���� ȯ�濡 �°� ������ ������ �˴ϴ�.
		// �׸���, ������ ����꿡 �ø��� �ȵǰ���? -> ���̱׳��
		
		//���� �غ�
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//ip , port ���ο� �°�
		String id = "C##KH";
		String pwd = "KH";
		
		//����̹� ���
		Connection conn = null;
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, id, pwd);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Ŀ�ؼ� �������� ����");
		}
		
		return conn;
	}
	
	public static void close(Connection conn) {
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(Statement stmt) {
		if(stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(ResultSet rs) {
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	
	
	
	

}//class






















