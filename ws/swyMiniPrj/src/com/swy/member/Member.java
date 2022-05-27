package com.swy.member;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.swy.db.OracleDB;
import com.swy.util.MyUtil;

public class Member {
	
	public static int loginUserNo;
	
	//�α���
	public boolean login() {
		System.out.println("=====�α���=====");
		System.out.print("���̵� : ");
		String id = MyUtil.sc.nextLine();
		System.out.print("�н����� : ");
		String pwd = MyUtil.sc.nextLine();
		
		//��� ���� ���
		Connection conn = OracleDB.getOracleConnection();
		//�ش� ���̵� �´� �н����� ��񿡼� ��ȸ�ϱ�
		String sql = "SELECT NO, PWD FROM MEMBER WHERE ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String dbPwd = rs.getString("PWD"); //Į�� ������ ���� ��ȣ �Ǵ� Į����
				int no = rs.getInt("NO");			//Į�������� ��ȸ��, ��ҹ��� ��� ����
				if(dbPwd.equalsIgnoreCase(pwd)) {
					//�α��� ����
					loginUserNo = no;
					System.out.println("�α��� ���� !!!");
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("SQL ���� �߻� !!!");
		}finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
			OracleDB.close(rs);
		}
		
		//��񿡼� ��ȸ�� �н����尡 ��ġ�ϴ��� Ȯ��
		System.out.println("�α��� ���� ...");
		return false;
	}
	
	//ȸ������
	/*
	 * ���̵�, ���, �г��� �Է¹ޱ�
	 * ���̵� �ߺ� �˻�
	 * ��й�ȣ ��ȿ�� �˻� (8���� �̻����� ,,, )
	 * ��� ����
	 */
	public boolean join() {
		System.out.println("=====ȸ������=====");
		System.out.print("���̵� : ");
		String id = MyUtil.sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pwd = MyUtil.sc.nextLine();
		System.out.print("�г��� : ");
		String nick = MyUtil.sc.nextLine();
		
		//��� ��ȿ�� �˻�
		if(pwd.length() < 4) {
			// ȸ������ ����
			System.out.println("��й�ȣ�� 4���� �̻� �̾�� �մϴ�.");
			return false;
		}
		
		//���̵� �ߺ� �˻�
		//1. ��� ����
		Connection conn = OracleDB.getOracleConnection();
		//2. ��񿡼� ���� ���̵�� ��ġ�ϴ� ���̵� ��ȸ
		try {
			String sql = "SELECT * FROM MEMBER WHERE ID = ?";
//			Statement stmtDup = conn.createStatement();
//			ResultSet rs = stmtDup.executeQuery(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//�ߺ��� ���̵�.. ȸ������ ����
				System.out.println("���̵� �ߺ�!!!");
				return false;
			}
			
			//��� ������ ����
			//3. ȸ�����Լ���? ��� ����
			String sqlInsert 
				= "INSERT INTO MEMBER(NO,ID,PWD,NICK) "
						+ "VALUES(MEMBER_NO_SEQ.NEXTVAL,?,?,?)";
//			Statement stmtInsert = conn.createStatement();
//			int result = stmtInsert.executeUpdate(sqlInsert);
			PreparedStatement pstmt2 = conn.prepareStatement(sqlInsert);
			pstmt2.setString(1, id);
			pstmt2.setString(2, pwd);
			pstmt2.setString(3, nick);
			int result = pstmt2.executeUpdate();
			
			if(result == 1) {
				System.out.println("ȸ�� ���� ���� !!!");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("ȸ������ ����...");
		return false;
	}

	/*
	 * ȸ�� ���� ����
	 */
	public void edit() {
		//�α��� �� ������ ���� ����
		//�α��� �������� �ٷ� ���Ͻ��ѹ�����
		if(!checkLogin()) {
			System.out.println("�α��� �� ������ ������ �����մϴ�.");
			return;
		}
		
		// �켱 ���� ȸ�� ������ ������� ��
		showUserInfo();
		
		// ������ ���� �����ϰ�  �� (��� ����, �г��� ����)
		
		// ���ÿ� ���� ���� �ۼ�
	}

	
	private void showUserInfo() {
		Connection conn = OracleDB.getOracleConnection();
		
		String sql = "SELECT * FROM MEMBER WHERE NO = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, loginUserNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String id = rs.getString("ID");
				String nick = rs.getString("NICK");
				Date enrollDate = rs.getDate("ENROLL_DATE");
				
				System.out.println("===== ���� ȸ�� ���� =====");
				
				System.out.println("id : " + id );
				System.out.println("NICK : " + nick );
				System.out.println("ENROLL_DATE : " + enrollDate );
				System.out.println("--------------------------");
				
				// ���� ���� Ȯ��
				System.out.print("ȸ������ �����Ͻðڽ��ϱ�??(Y,N)");
				String answer = MyUtil.sc.nextLine();
				if("Y".equalsIgnoreCase(answer)) {
					//ȸ������ ���� ����
					System.out.println("��� ����??(NICK, �����������׸�1, �����������׸�2 ...)");
					String col = MyUtil.sc.nextLine();
					if("NICK".equalsIgnoreCase(col)) {
						System.out.print("������ �г��� : " );
						String newNick = MyUtil.sc.nextLine();
						//���ο� �г������� DB update ����
						String sql2 = "UPDATE MEMBER SET NICK = ? WHERE NO = ?";
						pstmt = conn.prepareStatement(sql2);
						pstmt.setString(1, newNick);
						pstmt.setInt(2, loginUserNo);
						int result = pstmt.executeUpdate();
						if(result == 1) {
							System.out.println("�г��� ���� ����!");
						}else {
							System.out.println("�г��� ���� ����..");
						}
						
					}
				}else {
					System.out.println("ȸ������ ���� ����");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
			OracleDB.close(rs);
		}
		
	}

	/*
	 * ȸ�� Ż��
	 * 
	 * ȸ�� Ż�� Į���� Y �� �ٲ۴�.
	 */
	public void quit() {
		
		//�α��� �������� �ٷ� ���Ͻ��ѹ�����
		if(!checkLogin()) {
			System.out.println("�α��� �� ������ Ż�� �����մϴ�.");
			return;
		}
		
		
		System.out.println("===== ȸ�� Ż�� =====");
		
		System.out.println("Ż�� �Ͻðڽ��ϱ�?(Y,N)");
		String answer = MyUtil.sc.nextLine();
		
		if("y".equalsIgnoreCase(answer)) {
			//Ż�� ����
			quitMember();
			
		}else {
			//Ż�� ����
			// �����̴� ����
			System.out.println("�����̿��� ���� Ż������������ �Ф�");
		}
		
	}

	/*
	 * �α��� ���� �Ǵ�
	 * 
	 * @return true // �α����� �� ���
	 * @return false // �α����� ���� ���� ��� 
	 */
	private boolean checkLogin() {
		//�α��� �� ��쿡�� Ż�� �����ϵ��� ó��
		if(loginUserNo == 0) {
			return false;
		}
		return true;
	}

	//ȸ�� Ż�� ó��
	private void quitMember() {
		
		//��� ���� ���� ȸ���� Ż�� Į�� Y �� ó��
		//(���� ȸ�� ��ȣ�� ����ƽ ������ ����)
		Connection conn = OracleDB.getOracleConnection();
		
		String sql = "UPDATE MEMBER SET QUIT_YN = 'Y' WHERE NO = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, loginUserNo);
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("ȸ�� Ż�� �Ϸ�");
			}else {
				System.out.println("ȸ�� Ż�� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
		}
	}
	

}//class



























