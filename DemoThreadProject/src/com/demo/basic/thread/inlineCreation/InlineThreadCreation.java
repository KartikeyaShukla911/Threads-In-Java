package com.demo.basic.thread.inlineCreation;

import java.util.concurrent.TimeUnit;

public class InlineThreadCreation {

	//Anonymous Thread Creation
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<=10;i++) {
				System.out.println("<<< Thread - 1"+" runnint "+i);
				}
				
				try {
					TimeUnit.MILLISECONDS.sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();;
		
	}

}
