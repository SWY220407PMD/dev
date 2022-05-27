package com.swy.main;

import com.swy.board.Board;
import com.swy.member.Member;
import com.swy.util.MyUtil;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("swy mini prj");
		
		while(true) {
			System.out.println("==================");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 게시글 작성");
			System.out.println("4. 게시글 조회");
			System.out.println("5. 회원 정보 수정");
			System.out.println("6. 회원 탈퇴");
			
			int n = MyUtil.scInt();
			
			switch(n) {
			case 1 : new Member().join(); break;
			case 2 : new Member().login(); break;
			case 3 : new Board().write(); break;
			case 4 : new Board().showList(); break;
			case 5 : new Member().edit(); break;
			case 6 : new Member().quit(); break;
			default : System.out.println("다시 선택하세요");
			}
		}//while

	}//main

}//class











