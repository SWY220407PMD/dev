package com.kh.main;

public class Run2 {

	public static void main(String[] args) {
		
		//다차원 배열
		
		//2차원 배열
		int[][] a = new int[3][3];
		
		// 배열에 접근
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		
		
		for(int x = 0; x < 3; ++x) {
			for(int y = 0; y < 3; ++y) {
				System.out.println(a[x][y]);
			}
		}
		
	}//main

}//class
























