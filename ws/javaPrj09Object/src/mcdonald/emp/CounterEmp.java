package mcdonald.emp;

import java.util.Scanner;

public class CounterEmp {
	
	Scanner sc = new Scanner(System.in);
	
	String name;
	int money;
	
	//주문받기
	public String order() {
		System.out.println("주문 받을게요 ~~~");
		//입력받기 (햄버거이름)
		String ham = this.sc.nextLine();
		//주문받은 햄버거 이름 확인
		System.out.println(ham + " 주문 받았습니다 ~~~ ");
		return ham;
	}
	
	//계산하기
	public void calc() {
		System.out.println("계산할게요~~~");
		//사용자한테 돈 받기 (문자열로 입력받기)
		String price = this.sc.nextLine();
		//얼마 받았습니다 출력하기
		System.out.println(price + " 원 받았습니다~~~");
	}

}
