package main;

public class Main {

	public static void main(String[] args) {
		
		
		String name1 = Thread.currentThread().getName();
		System.out.print(name1 + " : ");
		System.out.println("===== ¾²·¹µå =====");
		
		Thread t = new TestThread();
		String name2 = t.getName();
		System.out.print(name2 + " : ");
		t.start();
		
	}

}
