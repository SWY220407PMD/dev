package practice;

public class Main {

	public static void main(String[] args) {
		
		// 길이가 10인 배열 생성,
		// 각 요소에 0 부터 9 까지의 숫자를 채워넣기
		
		int[] a = new int[10];
		
		// 각 요소에 값 할당
		for(int i = 0; i <= 9; i++) {
			a[i] = (i+1)*10;
		}
		
		//각 요소의 값 출력
		for(int i = 0; i <= 9; i++) { // 0 ~ 9
			System.out.println(a[i]);
		}
		
		

	}//main

}//class














