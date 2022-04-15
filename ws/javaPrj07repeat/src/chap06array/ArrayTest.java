package chap06array;

public class ArrayTest {
	
	//배열
	
	/*
	 * 배열 변수 선언 : int[] a; 	// 타입[] 변수명;  
	 * 배열 생성	   : new int[3];// new 타입[배열길이];
	 * 배열 접근	   : a[0];		// 변수명[인덱스];
	 * 
	 * <배열 초기화> : 배열을 생성하는 동시에, 값을 할당
	 * new int[]{1,2,3,4,5};
	 * {1,2,3,4,5};
	 * 
	 * - 배열의 인덱스는 0부터 시작한다.
	 */
	
	public void test() {
		int[] a;		//배열 변수 선언 
		a = new int[3];	//배열 생성 및 할당
		
		//배열의 각 요소에 접근하기
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
	}
	
	// 배열 (double 타입)
	public void test2() {
		double[] doubleArr = new double[3];
		doubleArr[0] = 1.111;
		doubleArr[1] = 2.222;
		doubleArr[2] = 3.333;
		
		System.out.println(doubleArr[0]);
		System.out.println(doubleArr[1]);
		System.out.println(doubleArr[2]);
		
	}
	
	// 배열 (String 타입)
	public void test3() {
		String[] strArr = new String[3];
		strArr[0] = "첫번째";
		strArr[1] = "두번째";
		strArr[2] = "세번째";
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}//class



























