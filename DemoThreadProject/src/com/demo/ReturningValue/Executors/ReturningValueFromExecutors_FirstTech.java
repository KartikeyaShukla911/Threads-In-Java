package com.demo.ReturningValue.Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ReturningValueFromExecutors_FirstTech {

	public static void main(String args[])
	{
		ExecutorService execService = Executors.newCachedThreadPool(new NamedThreadsFactory());
		Future<Integer> result1 = execService.submit(new CalculationTaskA(2,5,500));
		
		Future<Integer> result2 = execService.submit(new CalculationTaskA(7,5,500));
		try {
		System.out.println("Result1: "+result1.get());
		System.out.println("Result2: "+result2.get());
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}