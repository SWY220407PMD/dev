package com.swy.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.swy.db.OracleDB;
import com.swy.member.Member;
import com.swy.util.MyUtil;

public class Board {

	//게시글 작성
	public void write() {
		//작성자 == 로그인한 유저
		if(Member.loginUserNo == 0) {
			System.out.println("로그인 한 유저만 글을 쓸 수 있습니다.");
			return;
		}
		
		//안내 문구 출력
		//입력 받기 (제목, 내용)
		System.out.println("===== 게시글 작성 =====");
		System.out.print("제목 : ");
		String title = MyUtil.sc.nextLine();
		System.out.print("내용 : ");
		String content = MyUtil.sc.nextLine();
		
		
		//디비에 저장
		//연결 얻기
		Connection conn = OracleDB.getOracleConnection();
		//INSERT 쿼리 날리기
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
				System.out.println("게시글 등록 성공 !");
			}else {
				System.out.println("게시글 등록 실패 ..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
		}
	}

	//게시글 목록 조회
	public void showList() {
		
	}
	
	//게시글 상세 조회
	public void showBoardDetail() {
		
	}
	
	

}
