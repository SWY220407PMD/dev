package practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// 정수를 입력받고, 입력받은 정수를 출력한다.
//		위 작업을 계속 반복한다.
//		(단, 입력받은 정수가 0 이라면 프로그램을 종료한다.)
		
		
		while(true) {
			// 입력
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
			//if(입력받은숫자가 0이라면) {반복문 종료}
			if(input == 0) {
				break;
			}
			
			// 출력
			System.out.println(input);
		}
		
		

	}

}
