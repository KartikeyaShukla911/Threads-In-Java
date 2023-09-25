package com.demo.thread.Creation.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCreationUsingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new LoopClassA());
		t.start();
		new Thread(new LoopClassA()).start();
		
		
		ExecutorService executors = Executors.newFixedThreadPool(2);
		
		System.out.println("Executors started !!!!!!!!!!");
		for(int i=0;i<=10;i++)
		{
			System.out.println("Executor taking Fix thread");
			executors.execute(new LoopClassA());
		}
		
		System.out.println("Executors shutdown");
		executors.shutdown();
		
		//will throw error, since we have stopped
		
		ExecutorService cacheExec = Executors.newCachedThreadPool();
		
		System.out.println("Cached Thread pool started");
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Cached started");
			cacheExec.execute(new LoopClassA());
		}
		
		cacheExec.shutdown();
		
		ExecutorService singleThreadExe = Executors.newSingleThreadExecutor();
		
		System.out.println("Single Thread Executor");
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("single Thread started");
			
			singleThreadExe.execute(new LoopClassA());
		}
		
	}

}
