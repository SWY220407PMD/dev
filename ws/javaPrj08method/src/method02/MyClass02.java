package method02;

public class MyClass02 {
	
	// 메소드 (method)
	// == 우리가 수학시간에 배운 함수 //f(x)
	
	/*
	 * 메소드 작성 방법
	 * 접근제한자 리턴타입 메소드명 (매개변수)     {실행할 내용,  리턴값이 있다면 return 값}
	 * public   int    plusOne(int number){number++;   return number;}
	 * 
	 * - 리턴값이 없으면? void 라고 작성
	 * - 매개변수는 안받아도 되고, 여러개를 받아도 됨
	 * 
	 */
	
	/*
	 * 메소드 구성
	 * 메소드 헤드(==메소드 시그니처) 메소드 바디
	 * - 메소드의 헤드를 보면, 입력값의 정보 및 반환값의 정보 를 알 수 있다.
	 */
	
	public void test() {
		System.out.println("테스트 메소드 시작 ~~~");
//		myMethod01();
//		plusTen(10);
//		System.out.println(getAge());
		
		//plusOne 메소드를 호출한다. (숫자 10을 전달해줄 것)
		//호출을 통해 리턴받은 값을 출력해보기
		int result = plusOne(10);
		System.out.println(result);
		
		System.out.println("테스트 메소드 종료 ~~~");
	}
	
	//매개변수(전달해줘야 하는 값)가 없고, 리턴값(뱉어내는 값)이 없는 메소드
	public void myMethod01() {
		System.out.println("안녕 나는 출력문이야 ㅎㅎ");
	}
	
	//숫자(정수) 하나 전달받아서, 그 숫자에다가 +10 해서, 출력하는 메소드
	//매개변수가 있고, 리턴값이 없는 메소드
	public void plusTen(int x) {
		x = x+10;
		System.out.println(x);
	}
	
	//본인 나이 를 뱉어내는(==반환하는 ==return 하는) 메소드
	public int getAge() {
		System.out.println("getAge 메소드 호출됨 ~~~");
		return 20; //되돌아감
	}
	
	//정수 하나를 입력받고, +1 한 값을 리턴 하는 메소드
	//입력받는 값(매개변수)이 있고, 뱉어내는 값(==반환하는 ==return 하는)이 있는 메소드
	public int plusOne(int x) {
		x++;
		return x;
	}
	
	//반지름의 길이(정수)를 입력받고, 원의 넓이를 리턴하는 메소드
	//매개변수 : 반지름
	//리턴타입 : 실수형 데이터 (float, double)
	//실행할 내용 : 반지름을 이용하여 원의 넓이 계산
	public double calcCircle(int r) {
		double result = r * r * 3.14;
		return result;
	}
	
	
	
	
	
	
	
	
	

}//class



















