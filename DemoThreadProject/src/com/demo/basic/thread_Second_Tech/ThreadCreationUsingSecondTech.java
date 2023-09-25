/**
 * 
 */
package com.demo.basic.thread_Second_Tech;

import java.util.concurrent.TimeUnit;

/**
 * @author ellit
 *
 */
public class ThreadCreationUsingSecondTech {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RunnableThreadDemo();
		new RunnableThreadDemo();
	}

}

class RunnableThreadDemo implements Runnable
{
	private static int cnt=0;
	private int id;
	
	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
		System.out.println("<<< Thread - "+id+" running "+i);
		
		try {
			TimeUnit.MILLISECONDS.sleep(550);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public RunnableThreadDemo()
	{
		this.id = ++cnt;
		new Thread(this).start();
	}
	
}
