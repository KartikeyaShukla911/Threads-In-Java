package com.demo.basic.thread1;

import java.util.concurrent.TimeUnit;

public class BasicTestOnThreads {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 new DemoThread();
		 Thread t = new DemoThread();
	}
}
	
	class DemoThread extends Thread
	{
		
		static int cnt=0;
		int id;
		
		@Override
		public void run()
		{
			for(int i=10;i>=0;i--) {
			System.out.println("<<< Thread- "+id + " running times: "+i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
		}
		
		public DemoThread()
		{
			this.id = ++cnt;
			this.start();
		}
	}
