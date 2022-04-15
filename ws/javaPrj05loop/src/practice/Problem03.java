package practice;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 그 수 까지 출력하기
		
		//입력
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		// 1 ~ 입력값 (1씩 증가하면서)
		
		for(int x = 1;x <= input; x = x+1) {
			//출력
			System.out.println(x);
		}
		
		

	}

}
