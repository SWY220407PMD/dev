package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 카운트다운 하기
		
		// 입력
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		// 입력값 ~ 1 (1씩 감소하면서)
		
		//카운트다운
		for(int x = input;x > 0;x = x-1) {
			System.out.println(x);
		}

	}

}
