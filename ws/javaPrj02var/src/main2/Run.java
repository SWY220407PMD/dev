package main2;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 변수 (정수형)
		 * 
		 * 1바이트 byte 256 : -128 ~ +127 
		 * 2바이트 short 6553?
		 * 4바이트 int 42억개 -21억 ~ +21억
		 * 8바이트 long 아무튼 많아요
		 * 
		 * 왜 굳이 4개나 있을까?
		 * > 각 타입별로 나타낼 수 있는 범위가 달라요
		 */
		
		// a,b,c,d 라는 이름의 변수 4개 만들기 (타입은 위의 주석 참조)
		// 1,2,3,4 값 넣기
		// a,b,c,d 변수들 출력해보기
		
		byte a = -128;
		short b = 2;
		int c = 3;
		long d = 4;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//우리반 학생 나이 //3바이트
		byte s1 = 20;
		byte s2 = 30;
		byte s30 = 20;
		
		int age = 20;
		System.out.println(age);
		
		
		

		
		
		
		
	}

}
