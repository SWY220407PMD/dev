package com.kh.main;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		
		System.out.println("===== 로그인 =====");
		LoginTest lt = new LoginTest();
		
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine(); //엔터키 제거 목적
		
		if(num == 1) {
			lt.join();
		}else if(num == 2) {
			lt.login();
		}else {
			System.out.println("그런 숫자 없음");
		}
		

	}

}
