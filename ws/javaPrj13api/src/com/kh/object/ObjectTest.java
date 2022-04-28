package com.kh.object;

import vo.Person;

public class ObjectTest {
	
	public void test() {
		// getClass
		// 어떤 type 인지 알려줌
		String s = "abc";
		System.out.println(s.getClass());
		
		Person p = new Person("심원용", 1, 1, 1, 'M');
		System.out.println(p.getClass());
	}
	
	public void test2() {
		//hashCode
		// 객체의 ID값(주소값을 해싱한 정수형 데이터)을 정수로 출력
		// 문자열의 경우엔 처리방식이 조금 다름 (같은 문자열은 같은 해시코드를 가짐)
		Person p = new Person("심원용", 1, 1, 1, 'M');
		System.out.println(p.hashCode());
		
		Person p2 = new Person("심원용", 1, 1, 1, 'M');
		System.out.println(p2.hashCode());
		
		String s1 = "문자열1";
		System.out.println(s1.hashCode());
		
		String s2 = new String("문자열1");
		System.out.println(s2.hashCode());
	}
	
	public void test3() {
		//toString
		// toString 은 Object 에 작성되어있음
		// 객체가 기본적으로 호출하는 메소드
		// 보통 해당 객체의 값 확인을 위해 사용
		Person p = new Person("심원용", 1, 1, 1, 'M');
		System.out.println(p.toString());
		System.out.println(p);
		
		
	}

}//class





























