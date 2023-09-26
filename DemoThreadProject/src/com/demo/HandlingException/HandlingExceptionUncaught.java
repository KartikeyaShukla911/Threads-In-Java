package com.demo.HandlingException;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.demo.thread.rename.Executors.LoopTaskB;

public class HandlingExceptionUncaught {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler());
		
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.submit(new LoopTaskB());
		executor.execute(new LoopTaskB());
		System.out.println("Task closed");
	}

}
