package com.citibank.threads;

public class ThreadOne extends Thread{
//	public ThreadOne() {
//		// TODO Auto-generated constructor stub
//		System.out.println("ThreadOne Start");
//	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ThreadOne Start");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadOne " + i);
		}
		System.out.println("ThreadOne End");
	}
}
