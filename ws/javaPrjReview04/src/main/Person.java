package main;

public class Person implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + ":객체안에 오버라이드 된 메소드 ...");
	}

}
