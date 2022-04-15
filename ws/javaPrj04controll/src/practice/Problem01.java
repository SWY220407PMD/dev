package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		// 정수 하나를 입력받고
		// 입력받은 정수가
		// 홀수면 홀수 라고 출력
		// 짝수면 짝수 라고 출력
		
		//홀 , 짝 판단
		
		//입력 준비
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		//조건문
		if(x%2 == 1) {
			System.out.println("홀수");
		}
		else if(x%2 == 0) {
			if(x == 0) {
				System.out.println("zero");
			}else {
				System.out.println("짝수");
			}
		}
		
		
		
	}

}
