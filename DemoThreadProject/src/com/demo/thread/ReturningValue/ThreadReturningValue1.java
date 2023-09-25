package com.demo.thread.ReturningValue;

public class ThreadReturningValue1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main started");
		
		ThreadReturningValueA a = new ThreadReturningValueA(2,5,550);
		ThreadReturningValueA b = new ThreadReturningValueA(7,5,550);
		
		
		Thread t = new Thread(a,"Demo1");
		Thread d = new Thread(b,"Demo2");
		
		t.start();
		d.start();
		
		System.out.println("Sum from a: "+a.getSum());
		System.out.println("Sum from b: "+b.getSum());
		
	}

}
