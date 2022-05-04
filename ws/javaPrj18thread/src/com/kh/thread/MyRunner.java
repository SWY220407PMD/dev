package com.kh.thread;

public class MyRunner implements Runnable {

	@Override
	public void run() {
		
		boolean isFinish = false;
		int n = 0;
		while(!isFinish) {
			System.out.println(n++);
			try {
//				Thread.sleep(3000);
				Thread.currentThread().wait(3000);
			} catch (InterruptedException e) {
				isFinish = true;
				System.out.println("flag Á¾·á·Î ¹Ù²Þ");
			}
		}
		
	}

}//class













