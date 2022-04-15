package chap03oper;

public class OperTest {
	
	//연산자
	
	/*
	 * 1. 산술
	 * 2. 비교
	 * 3. 논리
	 */
	
	// 연산자 우선순위
	// 표를 외울 필요는 없음
	// 우리는 괄호가 있기 때문에...
	// 헷갈리면, 괄호를 활용하시면 됩니다.
	// 1 + 2 + (3 * 10)
	
	public void test() {
		// 산술 연산자
		// +, -, *, /, %, =
		// 숫자 숫자 => 숫자
		// 1  +  1 => 2
		System.out.println(1+1);
	}
	
	public void test2() {
		// 비교 연산자
		// < , >, <=, >=, ==, !=
		// 숫자 숫자 => 논리
		// 1  <  2 => true
		System.out.println(1 < 2);
	}
	
	public void test3() {
		// 논리 연산자
		// &&, || , !
		// 논리 논리 => 논리
		// true && false => false 
		System.out.println(true && false);
	}
	
	public void test4() {
		// 삼항 연산자
		// ? :
		// ? 앞의 값이 true 라면? 콜론(:) 왼쪽의 값을 선택
		// ? 앞의 값이 false라면? 콜론(:) 오른쪽 값을 선택
		int x;
		x = 1 > 2 ? 100 : -99;
		System.out.println(x);
	}
	

}//class



























