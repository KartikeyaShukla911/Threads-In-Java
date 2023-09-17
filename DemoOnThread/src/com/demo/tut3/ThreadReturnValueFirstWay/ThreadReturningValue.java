package com.demo.tut3.ThreadReturnValueFirstWay;

import com.demo.common.LoopValueA;

public class ThreadReturningValue {

	public static void main(String args[])
	{
		LoopValueA task1 = new LoopValueA(2,5);
		Thread t = new Thread(task1,"Thread-1");
		t.start();
		System.out.println("Sum from Thread 1"+task1.getSum());
	}
}
