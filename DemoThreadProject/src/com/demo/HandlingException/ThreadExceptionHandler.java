package com.demo.HandlingException;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		t.setUncaughtExceptionHandler(null);
		System.out.println("Caught execption in "+t+" with Throwable "+e);
	}

}
