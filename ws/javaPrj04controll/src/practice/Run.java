package practice;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		//1. 정수형 변수 하나 만들고, 숫자 입력받기
		//2. 해당 숫자가 양수인지, 음수인지, 0인지 판단하기 (출력문은 자유롭게 쓰시면 됩니다.)
		
		//if , else, else if
		//시작은 무조건 if
		//else if 는 여러개 사용 가능 (단, 앞에 if가 존재해야함) 
		//else 는 사용하려면, 무조건 마지막에만 사용 가능
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		
		if(x > 0) {
			System.out.println("+");
		}else if(x < 0) {
			System.out.println("-");
		}else {
			System.out.println("0");
		}

	}

}
