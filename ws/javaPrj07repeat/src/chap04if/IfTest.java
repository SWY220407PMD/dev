package chap04if;

public class IfTest {
	
	//조건문
	/*
	 * if, else-if, else
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

}
