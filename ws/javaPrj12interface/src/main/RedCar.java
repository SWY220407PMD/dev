package main;

public class RedCar implements Car {
	
	//상속받는 인터페이스의 모든 추상메소드를 구현해야 됨
	//그래야 현재 클래스 파일을 이용해서 객체가 생성될 수 있음
	
	// == > 인터페이스 를 상속받는 경우, 무조건 모든 메소드를 오버라이딩 해야함
	// == > 인터페이스 는 메소드 오버라이딩 을 강제화 하기 위해서 사용함
	
	@Override
	public String startCar() {
		return "홍자 시동 걸었음";
	}
	
	@Override
	public void go() {
		System.out.println("홍차, 석유로 앞으로 가는중...");
	}
	
	@Override
	public int stop() {
		return 100;
	}
	
}//class














