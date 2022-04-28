package com.kh.string;

public class StringTest {
	
	public void test() {
		//charAt
		// "문자열" 에서 특정 인덱스 의 '문자' 를 가져옴
		String s = "abcdefg";
		char ch = s.charAt(0);
		System.out.println("ch : " + ch); // a
	}
	
	public void test2() {
		// compareTo
		// 사전순으로 정렬했을 때, 앞이면 음수 , 같으면 0 , 뒤면 양수
		String s = "a";
		String s2 = "a";
		int x = s.compareTo(s2);
		System.out.println(x);
	}
	
	public void test3() {
		//concat
		//문자열 합쳐줌
		String s = "abc";
		String s2 = "zzz";
		
		String x = s.concat(s2);
		System.out.println(x);
	}
	
	public void test4() {
		// equals
		// 문자열 같은지 비교 (대소문자 구분)
		String s = "abc";
		String s2 = "ABC";
		System.out.println(s.equals(s2));
	}
	
	public void test5() {
		// equalsIgnoreCase
		// 문자열 같은지 비교 (대소문자 무시)
		String s = "abc";
		String s2 = "ABC";
		System.out.println(s.equalsIgnoreCase(s2));
	}
	
	public void test6() {
		//length
		//문자열의 길이 를 정수값으로 리턴
		String s = "ab c";
		System.out.println(s.length());
		
	}
	
	public void test7() {
		//replace
		// 특정 문자를 원하는 문자로 바꿔줌
		String s = "abccccccc123";
		String x = s.replace('c', 'S');
		System.out.println(s); //기존의 문자열은 그대로
		System.out.println(x); //새로 만든 문자열을 리턴함
	}
	
	public void test8() {
		//substring
		// 문자열의 특정 범위를 잘라냄
		// 시작인덱스 ~ 끝 
		// 시작인덱스 ~ 특정지점
		String s = "abc12345";
//		String x = s.substring(2);
		String x = s.substring(2, 5);
		System.out.println(x);
	}
	
	public void test9() {
		//toUpperCase
		String s = "abc123";
		String x = s.toUpperCase();
		System.out.println(x); //대문자로 변경된 문자열
		String low = test10(x);
		System.out.println(low);
	}
	
	public String test10(String str) {
		//toLowerCase
		return str.toLowerCase();
	}
	

}//class

































































