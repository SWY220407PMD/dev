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
	
	//稽益昔
	public boolean login() {
		System.out.println("=====稽益昔=====");
		System.out.print("焼戚巨 : ");
		String id = MyUtil.sc.nextLine();
		System.out.print("鳶什趨球 : ");
		String pwd = MyUtil.sc.nextLine();
		
		//巨搾 尻衣 条奄
		Connection conn = OracleDB.getOracleConnection();
		//背雁 焼戚巨拭 限澗 鳶什趨球 巨搾拭辞 繕噺馬奄
		String sql = "SELECT NO, PWD FROM MEMBER WHERE ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String dbPwd = rs.getString("PWD"); //町軍 授辞拭 魚献 腰硲 暁澗 町軍誤
				int no = rs.getInt("NO");			//町軍誤生稽 繕噺獣, 企社庚切 雌淫 蒸製
				if(dbPwd.equalsIgnoreCase(pwd)) {
					//稽益昔 失因
					loginUserNo = no;
					System.out.println("稽益昔 失因 !!!");
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("SQL 森須 降持 !!!");
		}finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
			OracleDB.close(rs);
		}
		
		//巨搾拭辞 繕噺廃 鳶什趨球亜 析帖馬澗走 溌昔
		System.out.println("稽益昔 叔鳶 ...");
		return false;
	}
	
	//噺据亜脊
	/*
	 * 焼戚巨, 搾腰, 莞革績 脊径閤奄
	 * 焼戚巨 掻差 伊紫
	 * 搾腔腰硲 政反失 伊紫 (8越切 戚雌昔走 ,,, )
	 * 巨搾拭 煽舌
	 */
	public boolean join() {
		System.out.println("=====噺据亜脊=====");
		System.out.print("焼戚巨 : ");
		String id = MyUtil.sc.nextLine();
		System.out.print("搾腔腰硲 : ");
		String pwd = MyUtil.sc.nextLine();
		System.out.print("莞革績 : ");
		String nick = MyUtil.sc.nextLine();
		
		//搾腰 政反失 伊紫
		if(pwd.length() < 4) {
			// 噺据亜脊 叔鳶
			System.out.println("搾腔腰硲澗 4越切 戚雌 戚嬢醤 杯艦陥.");
			return false;
		}
		
		//焼戚巨 掻差 伊紫
		//1. 巨搾 羨紗
		Connection conn = OracleDB.getOracleConnection();
		//2. 巨搾拭辞 薄仙 焼戚巨人 析帖馬澗 焼戚巨 繕噺
		try {
			String sql = "SELECT * FROM MEMBER WHERE ID = ?";
//			Statement stmtDup = conn.createStatement();
//			ResultSet rs = stmtDup.executeQuery(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//掻差吉 焼戚巨.. 噺据亜脊 叔鳶
				System.out.println("焼戚巨 掻差!!!");
				return false;
			}
			
			//巨搾拭 汽戚斗 煽舌
			//3. 噺据亜脊失因? 巨搾 煽舌
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
				System.out.println("噺据 亜脊 失因 !!!");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("噺据亜脊 叔鳶...");
		return false;
	}

	/*
	 * 噺据 舛左 呪舛
	 */
	public void edit() {
		//稽益昔 廃 政煽幻 羨悦 亜管
		//稽益昔 照梅生檎 郊稽 軒渡獣佃獄軒奄
		if(!checkLogin()) {
			System.out.println("稽益昔 廃 政煽幻 呪舛戚 亜管杯艦陥.");
			return;
		}
		
		// 酔識 薄仙 噺据 舛左研 左食操醤 敗
		showUserInfo();
		
		// 呪舛拝 舛左 識澱馬惟  敗 (搾腰 痕井, 莞革績 痕井)
		
		// 識澱拭 魚献 稽送 拙失
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
				
				System.out.println("===== 薄仙 噺据 舛左 =====");
				
				System.out.println("id : " + id );
				System.out.println("NICK : " + nick );
				System.out.println("ENROLL_DATE : " + enrollDate );
				System.out.println("--------------------------");
				
				// 呪舛 食採 溌昔
				System.out.print("噺据舛左 呪舛馬獣畏柔艦猿??(Y,N)");
				String answer = MyUtil.sc.nextLine();
				if("Y".equalsIgnoreCase(answer)) {
					//噺据舛左 呪舛 遭楳
					System.out.println("嬢恐暗 呪舛??(NICK, 呪舛亜管廃牌鯉1, 呪舛亜管廃牌鯉2 ...)");
					String col = MyUtil.sc.nextLine();
					if("NICK".equalsIgnoreCase(col)) {
						System.out.print("痕井拝 莞革績 : " );
						String newNick = MyUtil.sc.nextLine();
						//歯稽錘 莞革績生稽 DB update 遭楳
						String sql2 = "UPDATE MEMBER SET NICK = ? WHERE NO = ?";
						pstmt = conn.prepareStatement(sql2);
						pstmt.setString(1, newNick);
						pstmt.setInt(2, loginUserNo);
						int result = pstmt.executeUpdate();
						if(result == 1) {
							System.out.println("莞革績 痕井 失因!");
						}else {
							System.out.println("莞革績 痕井 叔鳶..");
						}
						
					}
				}else {
					System.out.println("噺据舛左 呪舛 照敗");
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
	 * 噺据 纏盗
	 * 
	 * 噺据 纏盗 町軍聖 Y 稽 郊菓陥.
	 */
	public void quit() {
		
		//稽益昔 照梅生檎 郊稽 軒渡獣佃獄軒奄
		if(!checkLogin()) {
			System.out.println("稽益昔 廃 政煽幻 纏盗亜 亜管杯艦陥.");
			return;
		}
		
		
		System.out.println("===== 噺据 纏盗 =====");
		
		System.out.println("纏盗 馬獣畏柔艦猿?(Y,N)");
		String answer = MyUtil.sc.nextLine();
		
		if("y".equalsIgnoreCase(answer)) {
			//纏盗 しし
			quitMember();
			
		}else {
			//纏盗 いい
			// 陥楳戚陥 ぞぞ
			System.out.println("陥楳戚拭推 ぞぞ 纏盗馬走原室推 ばぬ");
		}
		
	}

	/*
	 * 稽益昔 食採 毒舘
	 * 
	 * @return true // 稽益昔聖 廃 井酔
	 * @return false // 稽益昔聖 馬走 省精 井酔 
	 */
	private boolean checkLogin() {
		//稽益昔 廃 井酔拭幻 纏盗亜 亜管馬亀系 坦軒
		if(loginUserNo == 0) {
			return false;
		}
		return true;
	}

	//噺据 纏盗 坦軒
	private void quitMember() {
		
		//巨搾 亜辞 薄仙 噺据税 纏盗 町軍 Y 稽 坦軒
		//(薄仙 噺据 腰硲澗 什殿峠 痕呪拭 赤製)
		Connection conn = OracleDB.getOracleConnection();
		
		String sql = "UPDATE MEMBER SET QUIT_YN = 'Y' WHERE NO = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, loginUserNo);
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("噺据 纏盗 刃戟");
			}else {
				System.out.println("噺据 纏盗 叔鳶");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			OracleDB.close(conn);
			OracleDB.close(pstmt);
		}
	}
	

}//class



























