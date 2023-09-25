package com.demo.TerminatingThread;

public class TerminatingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new LoopTaskE());
		Thread e = new Thread(new LoopTaskE());
		t.start();
		e.start();
		System.out.println("Terminating Thread");
		
		t.interrupt();
		e.interrupt();
		
		System.out.println("Thread end");
	}

}
