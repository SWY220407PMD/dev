package practice;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		//정수를 입력받고, 1부터 입력받은수 까지 출력하는 프로그램을 만드세요
		//(단, 짝수는 출력하지 않는다.)
		
		//입력
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		//반복문 (1 ~ 입력값 , 1씩 증가하면서)
		for(int x=1 ; x<=input ; x=x+1) { 
			if(x % 2 == 0){ //짝수
				continue;
			}
			System.out.println(x);
		}
		

	}

}
