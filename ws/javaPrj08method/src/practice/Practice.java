package practice;

public class Practice {
	
	public void test() {
		System.out.println("practice start ~~~");
//		printHelloWorld();
		System.out.println("practice end ~~~");
	}
	
	//hello world 라고 출력하는 메소드 작성 //메소드 이름 : printHelloWorld
	public void printHelloWorld() {
		System.out.println("Hello World");
	}
	
	//메소드명 : printMyName
	//입력값 : 없음
	//반환값 : 없음
	//실행내용 : 본인 이름 출력
	public void printMyName() {
		System.out.println("심원용");
	}

	
	//메소드명 : multiple
	//입력값 : 정수
	//반환값 : 없음
	//실행 내용 : (입력받은 정수 * 2) 한 값을 출력
	public void multiple(int x) {
		System.out.println(x * 2);
	}
	
	
	//메소드명 : getName
	//입력값 : 없음
	//반환값 : 본인이름 (심원용)
	//실행내용 : 없음 (반환만 하시면 됩니다)
	public String getName() {
		return "심원용";
	}
	
	
	//메소드명 : plus
	//입력값 : 정수 2개
	//반환값 : 2개 정수를 합한 값
	//실행 내용 : 없음 (반환만 하시면 됩니다.)
	public long plus(int a, int b) {
		return a+b;
	}
	
	//위의 4개 메소드 작성 다 하면,
	//call by value , call by ref 구경해보기
	
	
	
	
	
	
	
	
	
	
	
	
}//class
