package com.kh.main;

public class Run {

	public static void main(String[] args) {
		
		//배열
		/*
		 * 타입이 같은 변수 여러개를 한번에 만들 수 있게 해줌
		 * 
		 * 배열 관련 3가지만 익히면 됩니다.
		 * 
		 * 1. 배열 변수 선언 					//int[] a;
		 * 2. 배열 생성     					//new int[3];
		 * 3. 배열의 각 요소(element)에 접근 		//a[0]
		 */
		
		
		//배열 선언
		// 타입[] 변수명;
		// 타입 변수명[];
		
		//int[] a;
		//int a[];
		//int [] a;
		
		// 배열 생성 및 할당
		//int[] a = new int[3];
		
		// 배열 초기화(==선언과 동시에 값을 할당)
		//int[] a = {1,2,3};
		//int[] a = new int[] {1,2,3,4,5,6};
		
		// 배열 길이 체크
		// 배열.length
		//System.out.println(a.length);
		
		// 배열의 요소(element)에 접근하기
		// 배열변수[인덱스]
		int[] a = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		// a[5] = 50; //배열의 인덱스를 벗어나면, 에러가 발생함
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		

		
		
		
		
		
		
		
		

	}//main

}//class



























