package practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		
		/*
		 * 월(month) 을 입력받고, 해당 월의 계절을 출력하기
			12, 1, 2 : winter
			  3, 4, 5 : spring
			  6, 7, 8 : summer
			  9, 10, 11 : fall
		 */
		
		//입력
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		//출력
//		if(month == 12 || month == 1 || month == 2) {
//			System.out.println("winter");
//		}
//		else if(month == 3 || month == 4 || month == 5) {
//			System.out.println("spring");
//		}
//		else if(month == 6 || month == 7 || month == 8) {
//			System.out.println("summer");
//		}else {
//			System.out.println("fall");
//		}
		
		//출력 (switch)
		switch(month) {
		case 12 : 
		case 1 : 
		case 2 : System.out.println("winter"); break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println("spring"); break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println("summer"); break;
		case 9 : 
		case 10 : 
		case 11 : System.out.println("fall"); break;
		default : System.out.println("해당 월은 존재하지 않습니다.");
		//식사 맛있게하세요 ~~~~~~~~~~~~~~~~~~~~~~~@@@@@@@@@@
		
		}
		
		

	}

}


















