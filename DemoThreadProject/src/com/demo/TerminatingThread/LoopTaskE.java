package com.demo.TerminatingThread;

import java.util.concurrent.TimeUnit;

public class LoopTaskE implements Runnable {

	private static int cnt=0;
	private int id;
	
	public LoopTaskE()
	{
		this.id = ++cnt;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
		System.out.println("<<< Thread - "+ id+" started running "+ i+" times");
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
