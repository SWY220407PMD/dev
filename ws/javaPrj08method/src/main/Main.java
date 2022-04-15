package main;

public class Main {
	
	public static void main(String[] args) {
		sayHello();
		// ~~~~ 어떤 작업 A
		sayHello();
		// ~~~ 어떤 작업 B
		sayHello();
	}
	
	public static void sayHello() {
		System.out.println("안녕");
		System.out.println("내 이름은");
		System.out.println("심원용");
	}
	
	

}

























