/**
 * 
 */
package com.demo.DaemonThread;

/**
 * @author ellit
 *
 */
public class LoopClassA extends Thread {

	private static int cnt=0;
	private int id;
	
	public LoopClassA()
	{
		this.id = ++cnt;
	}
	
	@Override
	public void run()
	{
		
		for(int i=0;i<=10;i++)
		System.out.println("Running Thread - "+ id + " running "+i+" times "+" Is Daemon " 
		+ this.currentThread().isDaemon() );
		
	}
}
