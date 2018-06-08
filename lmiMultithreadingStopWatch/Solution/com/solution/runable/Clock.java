package com.solution.runable;

import com.solution.beans.StopWatch;

public class Clock implements Runnable {

	@Override
	public void run() {
		StopWatch sw = StopWatch.getInstance();
		int lap = Integer.parseInt(Thread.currentThread().getName());

		try {
			sw.starts(lap);
		} catch (InterruptedException e1) {

			e1.printStackTrace();
		}

	}

}
