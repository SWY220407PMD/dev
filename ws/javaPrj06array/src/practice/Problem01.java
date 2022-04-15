package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		//코드업 1403
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 2번 출력하기 
		// k 개의 숫자를 입력받고 2번 출력
		
		// 0. k 입력받기
		int k = sc.nextInt();
		
		
		// 1. k개의 숫자를 적을 수 있는 메모장 준비
		int[] memo = new int[k];
		
		
		// 2. (숫자를 듣고, 메모장에 적기) * k 
		for(int i = 0; i<k; i++) { //i : 0 ~ k-1
			memo[i] = sc.nextInt();
		}
		
		
		// 3. 메모장의 i번째 요소 읽기 (단, i : 0~k-1)
		for(int i = 0; i<k; i++) {
			System.out.println(memo[i]);
		}
		
		for(int i = 0; i<k; i++) {
			System.out.println(memo[i]);
		}
		
		
		
		
		
		
		
	}

}
