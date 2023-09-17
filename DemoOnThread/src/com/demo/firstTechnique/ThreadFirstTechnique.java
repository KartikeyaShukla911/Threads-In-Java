/**
 * 
 */
package com.demo.firstTechnique;

import java.util.concurrent.TimeUnit;

/**
 * @author ellit
 *
 */

class ThreadDemo extends Thread
{
	private static int count=0;
	private int id;
	
	public ThreadDemo()
	{
		
		this.id = ++count;
		this.start();
	}
	
	@Override
	public void run() {
		int i;
		try {
			for(i=0;i<11;i++) {
				System.out.println("< Thread "+this.id + " Count in Thread " +i);
			
				TimeUnit.MILLISECONDS.sleep(250);
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		super.start();
	}
}

class newTechThread implements Runnable
{
	private static int count=0;
	private int id;

	@Override
	public void run() {
		int i;
		try {
			for(i=0;i<11;i++) {
				System.out.println("< Thread "+this.id + " Count in Thread " +i);
			
				TimeUnit.MILLISECONDS.sleep(250);
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
}

public class ThreadFirstTechnique {
	
	public static void main(String args[])
	{
		System.out.println("Thread started ");
		
		new ThreadDemo().start();
		new newTechThread();
		Thread t = new ThreadDemo();
		
	}
}
