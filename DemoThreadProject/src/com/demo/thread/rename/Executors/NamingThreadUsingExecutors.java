package com.demo.thread.rename.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NamingThreadUsingExecutors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService service = Executors.newCachedThreadPool(new ThreadFactoryClass());
		
		service.execute(new LoopTaskB());
	}

}
