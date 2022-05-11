package game;

import java.util.Scanner;

import util.InputUtil;

public class GameManager {
	
	public void gameStart() {
		//번호를 고르게 하기
		System.out.println("1 : 업다운게임");
		System.out.println("2 : 메이플");
		System.out.println("3 : 롤");
		System.out.println("4 : 옵치");
		System.out.println("5 : 로아");
		System.out.print("게임 번호 선택 : ");
		
//		Scanner sc = new Scanner(System.in);
//		String gameNumStr = sc.nextLine();
//		int gameNum = Integer.parseInt(gameNumStr);
		
		int gameNum = InputUtil.inputInt();
		
		switch(gameNum) {
		case 1: updownGameStart();
			break;
		case 2: //2 game ~~~
			break;
		case 3: //3 game ~~~~
			break;
		default : // error ~~~~ 
		}
	}
	
	private void updownGameStart() {
		System.out.println("1~100 사이의 숫자를 하나 고르세요 ~~~");
		//컴퓨터 랜덤 숫자 생성
		
		
		//1.업다운 비교, 결과 출력
		//2.입력받기
		// 1,2 를 무한반복 (맞출 떄 까지)
		
		System.out.println("당신이 이겼습니다 ~~~ ^^");
		
		//게임 결과 저장 필요하다?
		//저장 메소드 호출
	}

}//class











