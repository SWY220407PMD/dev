package com.swy.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.swy.db.OracleDB;
import com.swy.member.Member;
import com.swy.util.MyUtil;

public class Board {

	//�Խñ� �ۼ�
	public void write() {
		//�ۼ��� == �α����� ����
		if(Member.loginUserNo == 0) {
			System.out.println("�α��� �� ������ ���� �� �� �ֽ��ϴ�.");
			return;
		}
		
		//�ȳ� ���� ���
		//�Է� �ޱ� (����, ����)
		System.out.println("===== �Խñ� �ۼ� =====");
		System.out.print("���� : ");
		String title = MyUtil.sc.nextLine();
		System.out.print("���� : ");
		String content = MyUtil.sc.nextLine();
		
		
		//��� ����
		//���� ���
		Connection conn = OracleDB.getOracleConnection();
		//INSERT ���� ������
		String sql = "INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO, REGISTER_DATE, DELETE_YN)"
				+ "VALUES(BOARD_NO_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, 'N')";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, Member.loginUserNo);
			int  result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("�Խñ� ��� ���� !");
			}else {
				System.out.println("�Խñ� ��� ���� ..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
		}
	}

	//�Խñ� ��� ��ȸ
	public void showList() {
		
	}
	
	//�Խñ� �� ��ȸ
	public void showBoardDetail() {
		
	}
	
	

}
