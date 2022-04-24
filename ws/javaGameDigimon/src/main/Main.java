package main;

import java.util.Scanner;

import game.GameManager;
import user.User;

/* 대충 기획 비슷한거 ,,,

0. 닉네임 입력
1. 디지몬 보여주기 , 디지몬 선택
2. 배틀넷 입장
3. 랜덤으로 적 만나기 (야생의 ㅇㅇ 등장)
4. 배틀 시작
5. 적 정보 보여주기
6. 행동 선택 (싸운다/도망간다)
도망간다 -> 3번으로
7. (싸운다 선택 시) 배틀 진행
유저 행동 선택(공격,스킬,피하기)
컴퓨터 랜덤 행동 선택
배틀 종료시까지 반복

 */

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	public static User user;

	public static void main(String[] args) {
		
		System.out.println("디지몬RPG");
		System.out.println("=======================");
		
		GameManager gm = new GameManager();
		gm.gameStart();
		
	}

}
