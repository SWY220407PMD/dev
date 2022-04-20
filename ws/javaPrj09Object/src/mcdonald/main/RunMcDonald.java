package mcdonald.main;

import mcdonald.emp.CookEmp;
import mcdonald.emp.CounterEmp;
import mcdonald.emp.RiderEmp;

public class RunMcDonald {

	public static void main(String[] args) {
		
		System.out.println("=====맥도날드=====");
		
		//객체들 이용해서 프로그래밍 하기
		
		//객체들 미리 만들어놓기
		CounterEmp counter01 = new CounterEmp();
		CookEmp cook01 = new CookEmp();
		RiderEmp rider01 = new RiderEmp();
		
		//주문 -> 요리 -> 배달
		
		//주문 (카운터직원)
		String ham = counter01.order();
		cook01.cook(ham);
		rider01.delivery(ham);
		
		
		

	}//main

}//class

















