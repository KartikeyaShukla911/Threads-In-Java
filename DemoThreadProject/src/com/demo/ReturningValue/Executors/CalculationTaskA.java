package com.demo.ReturningValue.Executors;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CalculationTaskA implements Callable<Integer> {

	private int a;
	private int b;
	private int waitTime;
	private int id;
	private static int cnt=0;
	
	public CalculationTaskA(int a,int b,int waitTime)
	{
		this.a = a;
		this.b = b;
		this.waitTime = waitTime;
		this.id = ++cnt;
	}
	
	@Override
	public Integer call() throws Exception {
		System.out.println("<<< Thread- "+id+" started for calculating sum ");
		
		TimeUnit.MILLISECONDS.sleep(500);
		return a + b;
	}

}
