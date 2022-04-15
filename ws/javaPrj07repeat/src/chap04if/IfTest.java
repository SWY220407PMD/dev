package chap04if;

import java.util.Scanner;

public class IfTest {
	
	//조건문
	/*
	 * if, else-if, else
	 * switch
	 */
	
	//어떤 정수가 양수인지 음수인지 0인지 판단하기
	public void test() {
		int x = -1;
		
		if(x > 0) {
			System.out.println("양수");
		}else if(x < 0) {
			System.out.println("음수");
		}else {
			System.out.println("zero");
		}
	}
	
	//switch
	//달(month) x를 입력받고,
	//해당 달의 계절을 출력
	//(단, x의 값은 정수)
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		switch(x) {
		case 12:
		case 1: 
		case 2: System.out.println("겨울"); break;
		case 3: 
		case 4: 
		case 5: System.out.println("봄"); break;
		case 6: 
		case 7: 
		case 8: System.out.println("여름"); break;
		case 9: 
		case 10:
		case 11: System.out.println("가을"); break;
		default : System.out.println("그런 달(month)은 없습니다.");
		}
		
	}
	
	

}//class


























