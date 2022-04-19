package cafe.main;

import cafe.employee.CounterEmp;
import cafe.employee.KitchenEmp;

public class Run {

	public static void main(String[] args) {
		
		//객체의 메소드 사용
		//객체의 데이터(변수) 접근 가능
		
		System.out.println("cafe open ~~~ ");
		System.out.println("========================");
		
		CounterEmp ce = new CounterEmp();
		KitchenEmp ke = new KitchenEmp();
		
		ce.order();
		ce.calc();
		ke.cook();
		ke.complete();
		
		ce.nick = "심원용";
		ke.nick = "심투용";
		
		System.out.println("카운터직원 닉네임 : " + ce.nick);
		System.out.println("주방직원  닉네임 : " + ke.nick);
		
		// int : 0
		// float : 0.0f
		// char : '\0'; //??? 저도 잘 몰라요 찍은거에요 ㅎㅎ
		// boolean : false
		// String : null //문자열 == 문자 배열 // 배열 == 객체 //int[] == 객체 //char[] == 객체
		// 참조형 : null
		// String 알고보니 클래스 ,,,,
		
		
		
		
		

	}

}















