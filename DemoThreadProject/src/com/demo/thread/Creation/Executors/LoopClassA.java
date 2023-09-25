package com.demo.thread.Creation.Executors;

import java.util.concurrent.TimeUnit;

public class LoopClassA implements Runnable {

	private static int cnt=0;
	private int id;
	
	LoopClassA()
	{
		this.id= ++cnt;
	}

	@Override
	public void run() {

		String threadName = Thread.currentThread().getName();
		System.out.println("Old thread Name: "+threadName);
		
		Thread.currentThread().setName("DEMO-THREAD");
		
		for(int i=0;i<=10;i++) {
			System.out.println("<<< Thread - "+id+" running - "+i+" times.???");
			
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
