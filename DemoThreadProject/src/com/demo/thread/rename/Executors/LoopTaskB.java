package com.demo.thread.rename.Executors;

import java.util.concurrent.TimeUnit;

public class LoopTaskB implements Runnable {

	
	private static int cnt=0;
	private int id;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++) {
			System.out.println("<<< Thread - "+id+" running times: "+i + " Thread-Name"+
					Thread.currentThread().getName());
			
			try {
				TimeUnit.MILLISECONDS.sleep(550);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public LoopTaskB()
	{
		this.id = ++cnt;
	}
}