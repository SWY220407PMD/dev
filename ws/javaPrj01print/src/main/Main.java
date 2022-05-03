package main;

public class Main {

	public static void main(String[] args) {
		
		//이스케이프 문자
		
		//1. 출력문을 이용해서 아래와 같이 출력해주세요 
		// "안녕!"
		
		System.out.println("\"안녕!\""); // "안녕!"
		System.out.println("안\n녕");	// 줄바꿈
		System.out.println("안\r녕");	// 줄바꿈
		System.out.println("안\t녕");    // 띄어쓰기 4 칸 (tab 키를 누른것과 같음)
		
		// print vs println : 줄바꿈
		
		test();
		
	}
	
	// printf
	public static void test() {
		System.out.println("===== printf test =====");
		System.out.printf("%s", "abc");
		System.out.println(); //줄바꿈
		System.out.printf("%d", 10);
		System.out.println(); //줄바꿈
		System.out.printf("%c", 'a');
	}

}//class












