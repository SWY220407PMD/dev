package com.kh.main;

public class Run3 {

	public static void main(String[] args) {
		
		//다차원 배열
		//2차원 배열
		
		//배열 변수 선언 = 다차원배열 생성
		int[][] a = new int[3][3];
		
		a[0] = new int[4];
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[0][3] = 40;
		
		for(int i = 0; i<=3; i++) {
			System.out.println(a[0][i]);
		}
		
	}

}
