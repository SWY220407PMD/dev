package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
//		정수 하나 입력받고,
//		입력받은 정수가 7의 배수라면 "7의배수" 라고 출력
		
		//입력
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		// 판단
		if(x % 7 == 0) { // x를 7로 나누었을 때 나머지 가 0 이라면 7의 배수
			System.out.println("7의 배수");
		}
		

	}

}
