package com.demo.HandlingException;

import java.util.concurrent.TimeUnit;

public class LoopClassH implements Runnable{

	private static int cnt=0;
	private int id;
	
	public LoopClassH()
	{
		this.id = ++cnt;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++) {
		System.out.println("<<< Executing Thread- "+id+" running times : "+i);
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	}
}
