package com.kh.thread;

public class RunnerMethodA implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0 ; i < 10; ++i) {
			//할일 하기
			Main.factory.methodA();
		}
		
	}

	
	
}
