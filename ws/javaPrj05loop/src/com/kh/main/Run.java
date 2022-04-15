package com.kh.main;

public class Run {

	public static void main(String[] args) {
		
		// 반복문 (for, while, do-while)
		// continue , break
		// continue : 반복문의 처음으로 돌아감
		// break : 반복문을 박살냄
		
		// hi 라고 10번 출력하는 프로그램을 작성하세요
		
		/*
		 * while 문법
		 * while(조건식){실행할내용}
		 * 
		 * 조건식이 true 인 경우에만, 중괄호 블록 안의 내용을 실행
		 * 실행할 내용 블럭 끝까지 읽으면, 처음으로 돌아감
		 */
		
		//while
//		int cnt = 0; //초기식
//		while(cnt < 10) { //조건식
//			System.out.println("hi");
//			cnt = cnt+1; //증감식
//		}
		
		/*
		 * for 문법
		 * for(초기식;조건식;증감식){실행할내용}
		 */
		
		//for
//		for(int i = 0; i < 10; i=i+1) {
//			System.out.println("hi");
//		}
		
		
		/*
		 * do while 문법
		 * do{실행할 내용}while(조건식);
		 * 
		 * 일단 실행, 그 다음 검사
		 * (한번은 무조건 실행)
		 */
		//do - while
		
		int x = 3; //초기식
		do {
			System.out.println("Hi");
			x = x+1; //증감식
		}while(x < 10);//조건식
	}

}












