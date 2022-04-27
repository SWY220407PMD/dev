package main;

public interface Car {

	/*
	 * 인터페이스
	 * 
	 * 모든 메소드는 추상메소드이다.
	 * 모든 메소드는 public abstract 이다.
	 * public abstract 는 생략이 가능하다.
	 */
	
	//모든 자동차가 공통적으로 가져야 할 메소드 (추상메소드)
	
	/*public abstract*/ String startCar();
	void go();
	int stop();
	
}//interface




















