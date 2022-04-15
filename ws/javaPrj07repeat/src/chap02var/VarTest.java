package chap02var;

public class VarTest {
	
	/*
	 * 변수 명명 규칙
	 * - 클래스 이름은 대문자로 시작
	 * - 메소드 이름, 변수명 은 소문자로 시작
	 * - 띄어쓰기가 있는 여러 단어의 경우, 띄어쓰기 대신 붙여쓰고 다음단어의 시작을 대문자로 변경
	 * - 상수변수 이름은 모두 대문자로 작성			   //ex) PI
	 * - 상수변수 이름이 여러개의 단어인 경우, '_' 를 사용  //ex) MAX_SIZE
	 * 
	 * - PascalCase //대문자로 시작, 띄어쓰기 대신 대문자
	 * - camelCase // 소문자로 시작, 띄어쓰기 대신 대문자
	 * - 클래스명 은 PascalCase
	 * - 메소드, 변수명 은 camelCase
	 */

	public void test() {
		int x = 10;
		System.out.println(x);
	}
	
	public void test2() {
		//정수형 변수
		byte b = 127;	//1 byte
		short s = 1;	//2 byte
		int i = 10;		//4 byte
		long l = 999;	//8 byte
		
		System.out.println("byte b : " + b);
		System.out.println("short s : " + s);
		System.out.println("int i : " + i);
		System.out.println("long l : " + l);
		
	}
	
	public void test3() {
		//실수형 변수
		float f = 3.14f;		//4 byte
		double d = 1.23456789;	//8 byte
		
		System.out.println("float f : " + f);
		System.out.println("double d : " + d);
	}
	
	
	public void test4() {
		//논리형 변수
		boolean b = true;	//1 byte
		System.out.println(b);
	}
	
	public void test5() {
		//문자
		char ch = 'A';
		System.out.println((int)ch); //컴퓨터는 문자를 숫자로 기억한다.
		
	}
	
	public void test6() {
		//문자열 (==문자 배열)
		String str = "심원용";
		System.out.println(str);
		
		final double PI = 3.14;
		System.out.println(PI);
		
	}
	
	//상수 (== 항상 같은 값을 가지는 수)
	public void test7() {
		final double PI = 3.14; //pi == 상수 (final을 붙였으니까)
		//3.14 를 이용해서 계산하는 프로그램 ~~~~~ (원의넓이 구하거나 머 그런거 ,,,,,)
		
//		pi = 3.41; //상수는 다시 값을 할당할 수 없음
	}
	
	
	
	
	
	
	
	
	
}//class































