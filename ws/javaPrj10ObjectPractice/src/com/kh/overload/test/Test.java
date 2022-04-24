package com.kh.overload.test;

public class Test {
	
	/*
	 * 생성자
	 * 
	 * [접근제한자] 클래스명(..){객체가 생성되는 순간, 실행하고싶은 내용}
	 * 
	 * 객체를 생성하려면 생성자를 호출해야 한다.
	 */
	
	//생성자 (기본 생성자)
	public Test() {
		System.out.println("기본 생성자 호출됨...");
		this.name = "심원용";
	}
	
	//생성자 (근데 이제,,, 매개변수를 곁들인,,,)
	public Test(String s) {
		System.out.println("문자열 하나 전달받는 생성자 호출됨...");
		if(s.equals("zzz")) {
			System.out.println("이름 제대로 지어줘 ..");
		}
		this.name = s;
	}
	
	//data
	public String name;
	
	public void hi() {
		System.out.println("hi");
	}
	
	public void hi(String name) {
		System.out.println("hi " + name);
	}
	

}//class


















