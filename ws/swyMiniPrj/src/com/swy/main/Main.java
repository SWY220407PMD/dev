package com.swy.main;

import com.swy.member.Member;
import com.swy.util.MyUtil;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("swy mini prj");
		
		System.out.println("==================");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 333");
		System.out.println("4. 444");
		System.out.println("5. 555");
		
		int n = MyUtil.scInt();
		
		switch(n) {
		case 1 : new Member().join(); break;
		case 2 : new Member().login(); break;
		case 3 :  break;
		case 4 :  break;
		case 5 :  break;
		default : System.out.println("다시 선택하세요");
		}
		
		

	}

}
