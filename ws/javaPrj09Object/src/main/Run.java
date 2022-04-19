package main;

import java.util.Scanner;

import practice.MyClass01;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("Run 클래스의 main 메소드 호출됨...");
		System.out.println("============================");
		
		//객체 생성 (MyClass01 클래스 파일을 이용해서 객체)
		MyClass01 mc01 = new MyClass01();
		MyClass01 mc011 = new MyClass01();  //swy
		//객체의 메소드 호출 (MyClass01 클래스 파일의 myMethod01 호출)
		mc01 = mc011; //swy
		mc01.myMethod01();
		mc01.myMethod02();
		
		
		
		
		
		
		//<객체지향>
		
		//붕어빵
		/*
		 * class : 붕어빵 틀
		 * 객체(== Object == instance) : 붕어빵
		 */
		
		//설계도
		/*
		 * class : 설계도
		 * 객체 : 설계도를 이용해서 만들어진 제품
		 */
		
		// 카페 아르바이트
		// 철수 영희
		
		/*
		 * <객체지향>
		 * [카운터 직원]
		 * - 닉네임
		 * - 시급 : 9천원
		 * - 주문받는 기능
		 * - 계산 기능
		 * 
		 * [주방 직원]
		 * - 닉네임
		 * - 시급 : 만원
		 * - 음료 제조 기능
		 * - 음료 건네는 기능
		 * 
		 */
		
		/*
		 * <절차지향>
		 * 1. 손님이 들어옴
		 * 2. 주문 받음
		 * 2-1 (주문취소하고 떠남, 아래 내용 실행하지 않음)
		 * 3. 계산
		 * 3-1 (잔액부족, 손님이 민망스,, 나감,,,그러면 아래 내용 실행 ㄴㄴ , 위에서 주문받은거 취소)
		 * 4. 음료 제조
		 * 5. 음료 건넴
		 * 
		 */
		
	}//main

}//class































