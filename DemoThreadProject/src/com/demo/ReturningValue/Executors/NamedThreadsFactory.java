package com.demo.ReturningValue.Executors;

import java.util.concurrent.ThreadFactory;

public class NamedThreadsFactory implements ThreadFactory {

	private static int cnt=0;
	
	
	@Override
	public Thread newThread(Runnable r) {
		
		Thread t = new Thread(r, "Pool-Thread-"+ ++cnt);
		if(cnt%2==0)
			t.setDaemon(true);
		return t;
	}

}
