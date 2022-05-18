package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
        System.out.println("jdbc test ~~~");
        
        //DB �� ������ �Ϸ���.... ??? id, pwd, ip, port, sid
        String id = "C##KH";
        String pwd = "KH";
        String ip = "127.0.0.1";
        String port = "1521";
        String sid = "xe";
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        //OracleDriver ���
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//����(Connection) ���
	        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	        conn = DriverManager.getConnection(url, id, pwd);
	        System.out.println(conn);
	        
	        stmt = conn.createStatement();
	        rs = stmt.executeQuery("SELECT * FROM EMP");
	        
	        System.out.println(rs);
	        
	        while(rs.next()) {
	        	int empNo = rs.getInt("EMPNO");
	            String ename = rs.getString("ENAME");
	            System.out.println(empNo + " / " + ename);
	        }
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Ŭ���� ��ã��.....");
		} finally {
			//�ڿ� ����
	        try {conn.close();} catch (SQLException e) {}
	        try {stmt.close();} catch (SQLException e) {}
	        try {rs.close();} catch (SQLException e) {}
		}
        
        
        
        
        
        
        
        

	}

}//class












