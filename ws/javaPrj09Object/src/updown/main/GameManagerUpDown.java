package updown.main;

import java.util.Random;
import java.util.Scanner;

public class GameManagerUpDown {
	
	public final String gameName = "업다운";
	
	public void gameStart() {
		System.out.println(gameName + " 게임 시작~~~");
		
		// 컴퓨터가 랜덤 숫자 하나 생각하게 하고
		// 정수 하나 입력받고
		// 업다운 얘기해주고
		// 틀리면 맞출떄까지 시도 하게하고
		// 맞추면 "정답입니다" 출력 해주기
		
		//랜덤숫자
		int r = new Random().nextInt(50);
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		//반복
		//업다운 판단
		while(true) {
			int input = sc.nextInt();
			if(input < r) {
				System.out.println("UP");
			}else if(input > r){
				System.out.println("DOWN");
			}else {
				System.out.println("정답입니다~~~");
				break;
			}
		}
		
	}//gameStart

}















