package practice;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		/*
		 * 	2월이 29일까지 있는 해를 윤년이라고 한다.
			어떤 해가 입력되면 그 해가 윤년인지 아닌지 판별하시오.
			윤년 판단 조건
			조건1) 해(year)가 4의 배수이면서 100의 배수가 아니면 윤년.
			조건2) 400의 배수이면 윤년.
			위 두 조건 중 하나라도 맞으면 윤년이다.
		 */
		
		//해 입력받기
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		//윤년 판단 
		//조건1) 해(year)가 4의 배수이면서 100의 배수가 아니면 윤년.
		//조건2) 400의 배수이면 윤년.
		if( (year%4==0 && year%100!=0)  ||  (year%400==0) ) {
			System.out.println("윤년~~~");
		}
		
	}

}



















