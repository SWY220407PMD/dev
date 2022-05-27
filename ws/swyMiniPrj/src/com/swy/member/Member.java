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
	
	//로그인
	public boolean login() {
		System.out.println("=====로그인=====");
		System.out.print("아이디 : ");
		String id = MyUtil.sc.nextLine();
		System.out.print("패스워드 : ");
		String pwd = MyUtil.sc.nextLine();
		
		//디비 연결 얻기
		Connection conn = OracleDB.getOracleConnection();
		//해당 아이디에 맞는 패스워드 디비에서 조회하기
		String sql = "SELECT NO, PWD FROM MEMBER WHERE ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String dbPwd = rs.getString("PWD"); //칼럼 순서에 따른 번호 또는 칼럼명
				int no = rs.getInt("NO");			//칼럼명으로 조회시, 대소문자 상관 없음
				if(dbPwd.equalsIgnoreCase(pwd)) {
					//로그인 성공
					loginUserNo = no;
					System.out.println("로그인 성공 !!!");
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("SQL 예외 발생 !!!");
		}finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
			OracleDB.close(rs);
		}
		
		//디비에서 조회한 패스워드가 일치하는지 확인
		System.out.println("로그인 실패 ...");
		return false;
	}
	
	//회원가입
	/*
	 * 아이디, 비번, 닉네임 입력받기
	 * 아이디 중복 검사
	 * 비밀번호 유효성 검사 (8글자 이상인지 ,,, )
	 * 디비에 저장
	 */
	public boolean join() {
		System.out.println("=====회원가입=====");
		System.out.print("아이디 : ");
		String id = MyUtil.sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = MyUtil.sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = MyUtil.sc.nextLine();
		
		//비번 유효성 검사
		if(pwd.length() < 4) {
			// 회원가입 실패
			System.out.println("비밀번호는 4글자 이상 이어야 합니다.");
			return false;
		}
		
		//아이디 중복 검사
		//1. 디비 접속
		Connection conn = OracleDB.getOracleConnection();
		//2. 디비에서 현재 아이디와 일치하는 아이디 조회
		try {
			String sql = "SELECT * FROM MEMBER WHERE ID = ?";
//			Statement stmtDup = conn.createStatement();
//			ResultSet rs = stmtDup.executeQuery(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//중복된 아이디.. 회원가입 실패
				System.out.println("아이디 중복!!!");
				return false;
			}
			
			//디비에 데이터 저장
			//3. 회원가입성공? 디비 저장
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
				System.out.println("회원 가입 성공 !!!");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("회원가입 실패...");
		return false;
	}

	/*
	 * 회원 정보 수정
	 */
	public void edit() {
		//로그인 한 유저만 접근 가능
		//로그인 안했으면 바로 리턴시켜버리기
		if(!checkLogin()) {
			System.out.println("로그인 한 유저만 수정이 가능합니다.");
			return;
		}
		
		// 우선 현재 회원 정보를 보여줘야 함
		showUserInfo();
		
		// 수정할 정보 선택하게  함 (비번 변경, 닉네임 변경)
		
		// 선택에 따른 로직 작성
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
				
				System.out.println("===== 현재 회원 정보 =====");
				
				System.out.println("id : " + id );
				System.out.println("NICK : " + nick );
				System.out.println("ENROLL_DATE : " + enrollDate );
				System.out.println("--------------------------");
				
				// 수정 여부 확인
				System.out.print("회원정보 수정하시겠습니까??(Y,N)");
				String answer = MyUtil.sc.nextLine();
				if("Y".equalsIgnoreCase(answer)) {
					//회원정보 수정 진행
					System.out.println("어떤거 수정??(NICK, 수정가능한항목1, 수정가능한항목2 ...)");
					String col = MyUtil.sc.nextLine();
					if("NICK".equalsIgnoreCase(col)) {
						System.out.print("변경할 닉네임 : " );
						String newNick = MyUtil.sc.nextLine();
						//새로운 닉네임으로 DB update 진행
						String sql2 = "UPDATE MEMBER SET NICK = ? WHERE NO = ?";
						pstmt = conn.prepareStatement(sql2);
						pstmt.setString(1, newNick);
						pstmt.setInt(2, loginUserNo);
						int result = pstmt.executeUpdate();
						if(result == 1) {
							System.out.println("닉네임 변경 성공!");
						}else {
							System.out.println("닉네임 변경 실패..");
						}
						
					}
				}else {
					System.out.println("회원정보 수정 안함");
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
	 * 회원 탈퇴
	 * 
	 * 회원 탈퇴 칼럼을 Y 로 바꾼다.
	 */
	public void quit() {
		
		//로그인 안했으면 바로 리턴시켜버리기
		if(!checkLogin()) {
			System.out.println("로그인 한 유저만 탈퇴가 가능합니다.");
			return;
		}
		
		
		System.out.println("===== 회원 탈퇴 =====");
		
		System.out.println("탈퇴 하시겠습니까?(Y,N)");
		String answer = MyUtil.sc.nextLine();
		
		if("y".equalsIgnoreCase(answer)) {
			//탈퇴 ㅇㅇ
			quitMember();
			
		}else {
			//탈퇴 ㄴㄴ
			// 다행이다 ㅎㅎ
			System.out.println("다행이에요 ㅎㅎ 탈퇴하지마세요 ㅠㅜ");
		}
		
	}

	/*
	 * 로그인 여부 판단
	 * 
	 * @return true // 로그인을 한 경우
	 * @return false // 로그인을 하지 않은 경우 
	 */
	private boolean checkLogin() {
		//로그인 한 경우에만 탈퇴가 가능하도록 처리
		if(loginUserNo == 0) {
			return false;
		}
		return true;
	}

	//회원 탈퇴 처리
	private void quitMember() {
		
		//디비 가서 현재 회원의 탈퇴 칼럼 Y 로 처리
		//(현재 회원 번호는 스태틱 변수에 있음)
		Connection conn = OracleDB.getOracleConnection();
		
		String sql = "UPDATE MEMBER SET QUIT_YN = 'Y' WHERE NO = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, loginUserNo);
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("회원 탈퇴 완료");
			}else {
				System.out.println("회원 탈퇴 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
		}
	}
	

}//class



























