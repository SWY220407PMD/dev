package main;

public class Main {

	public static void main(String[] args) {
		
		// 쓰레드 생성방법 3가지
		// 쓰레드 시작 방법 (start)
		// run 으로 호출하면, 새로운 쓰레드가 생성되지 않음
		
		String name = Thread.currentThread().getName();
		System.out.print(name + " : ");
		System.out.println("===== 쓰레드 =====");
		
		// extends Thread 객체를 활용하여 쓰레드 생성
		Thread t1 = new MyThread();
		t1.start();
		
		//implements Runnable 객체를 활용하여 쓰레드 생성 
		Thread t2 = new Thread(new MyRunner());
		t2.start();
		
		//람다식(lambda) 을 활용하여 쓰레드 생성
		Thread t3 = new Thread(
							() ->
							{ 
								System.out.print(Thread.currentThread().getName() + " : ");
								System.out.println("이게 람다식 ㅎㅎ");
							});
		t3.start();
		


	}

}//class









