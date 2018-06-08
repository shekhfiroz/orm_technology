package com.lmimtsw.runable;

import com.syn.beans.StopWatch;

public class Clock implements Runnable{

	@Override
	public void run() {
		StopWatch sw = StopWatch.getInstance();
		int lap = Integer.parseInt(Thread.currentThread().getName());
		sw.setHigh(lap);
		try {
			sw.starts();
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}		
		
				
		
	}
	

}
