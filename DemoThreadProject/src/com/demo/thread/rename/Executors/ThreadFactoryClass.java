package com.demo.thread.rename.Executors;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryClass implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		
		Thread t = new Thread(r,"demo=thread");
		
		return t;
	}

}
