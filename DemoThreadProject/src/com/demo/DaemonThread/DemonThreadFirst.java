/**
 * 
 */
package com.demo.DaemonThread;



import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.demo.ReturningValue.Executors.NamedThreadsFactory;

/**
 * @author ellit
 *
 */
public class DemonThreadFirst {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new LoopClassA());
		t.setDaemon(true);
		t.start();
		
		
		new Thread(new LoopClassA()).start();
		
		ExecutorService exeService = Executors.newCachedThreadPool(new NamedThreadsFactory());
		exeService.execute(new LoopClassA());
		
		Future<?> f1 = exeService.submit(new LoopClassA());
		
		//exeService.execute(f1);
		System.out.println("F1 done Alive? : "+f1.isDone() + " f1 "+f1.get());
	}

}
