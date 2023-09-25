package com.demo.thread.ReturningValue;

import java.util.concurrent.TimeUnit;

public class ThreadReturningValueA implements Runnable {

	private static int cnt=0;
	private int id;
	private int a;
	private int b;
	private int sum;
	private int waitTime;
	private boolean flag = false;
	
	public ThreadReturningValueA(int a,int b, int waitTime)
	{
		this.id = ++cnt;
		this.a = a;
		this.b = b;
		this.waitTime = waitTime;
	}
	
	public int getSum() throws InterruptedException
	{
		synchronized (this) {
			if(!flag)
			{
				System.out.println("Thread waiting "+Thread.currentThread().getName());
				this.wait();
			}
		}
		return sum;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread "+Thread.currentThread().getName()+" started");
		
		try {
			TimeUnit.MILLISECONDS.sleep(waitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sum = a + b;
		flag = true;
		if(flag)
		{
			synchronized (this) {
				this.notify();
			}
		}
	}
	
}
