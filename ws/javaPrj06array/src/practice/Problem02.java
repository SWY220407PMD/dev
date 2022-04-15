package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1~23 번 까지 있음
		int[] memo = new int[24]; //0~23
		
		//선생님이 n번 출석 부를거임
		int n = sc.nextInt();
		

		//n번 반복
		for(int i = 0 ; i < n; i++) {
			//선생님이 부른 출석번호 확인
			int x = sc.nextInt();
			//x번 칸에 가서 체크
			memo[x] = 1;
		}
		
		for(int i = 1; i <=23; ++i) {
			if(memo[i] == 1) {
				System.out.println(i);
				break;// @@@@@@@@@@@@@@@@@ (이거 빼먹었네요 ㅜㅠ)
			}
		}
		
		//강사님은 쉬는시간에 뭐하시나요??
		//>> 쉬고있습니다 ..... ㅋㅋㅋㅋ
		
		
	}


}
