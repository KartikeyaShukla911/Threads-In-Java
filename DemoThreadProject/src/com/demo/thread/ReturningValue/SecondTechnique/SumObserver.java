package com.demo.thread.ReturningValue.SecondTechnique;

public class SumObserver implements ReturningInterface {

	private String taskId;
	private static int cnt=0;
	private  int id;
	
	public SumObserver()
	{
		this.id = ++cnt;
	}
	
	@Override
	public void returnValue(int sum) {
		// TODO Auto-generated method stub
		System.out.println("Thread return sum valu: "+sum);
	}

}
