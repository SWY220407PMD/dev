package com.kh.main;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 제어문
		 * 
		 * 1. 조건문 (if, switch)
		 * 2. 반복문
		 */
		
		
		// 조건문 ( if , else, else~if ) , (switch , case, default, break)
		// 조건에 맞으면 실행 하게 해줌
		
		// if
		/*
		 * 표현식 :
		 * if(조건식){실행할 내용}
		 * 
		 * 조건식에 들어갈 내용은 ??? 
		 * > true / false 로 나올 수 있도록 작성
		 */
		
		
		
		//else : 또 다른 , 그밖에
		/*
		 * 표현식
		 * if(조건식){실행할내용}
		 * else {실행할내용}
		 * 
		 * else는 앞에서 if를 사용한 경우에만 쓸 수 있음
		 * 
		 * 앞의 if 조건을 통과하지 못하면, 무조건 실행 됨
		 */
		
		
		
		//else ~ if
		/*
		 * 표현식
		 * if(조건식){실행할내용}
		 * else if(조건식){실행할내용}
		 * else if(조건식){실행할내용}
		 * .
		 * .
		 * .
		 * (여러개 사용 가능)
		 */
		
		
		// num 이라는 변수를 만들고,
		// 값은 아무거나 집어넣고,
		// num 값이 양수라면? 양수입니다. 출력
		// num 값이 0 이라면? ZERO    출력
		// num 값이 음수라면? 음수입니다. 출력
		
//		int num = 0;
//		
//		if(num > 0) {
//			System.out.println("+");
//		}
//		else if(num < 0) {
//			System.out.println("-");
//		}
//		else if(num == 0) {
//			System.out.println("0");
//		}
		
		//switch
		/*
		 * 표현식 : 
		 * switch(?){
		 *  case ? : 실행구문; 
		 *  case ? : 실행구문;
		 *  .
		 *  .
		 *  .
		 *  default : 실행구문;
		 *  }
		 */
		
		
		int x = 1;
		
		switch(x) {
		case 1 : System.out.println("일"); break;
		case 2 : System.out.println("이"); break;
		case 3 : System.out.println("삼"); break;
		default : System.out.println("범위에 없음"); //else 같은 키워드
		}
		
		

	}

}
