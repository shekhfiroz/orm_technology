package com.lmimtsw.beans;

public class StopWatch {
	public static StopWatch instance;
	private int High = 0;

	public void setHigh(int high) {
		High = high;
	}

	private StopWatch() {

	}

	public void starts() throws InterruptedException {

		if (High == 50) {
			System.out.println("Thread 1");
			for (int i = 0; i < High; i++) {
				System.out.print("  ");
				System.out.print(i);
				System.out.print("  ");
				// System.out.println("switch");
				// System.out.println(High);
				Thread.sleep(1000);
			}
		} else if (High == 40) {
			System.out.println("Thread 2");
			for (int i = 0; i < High; i++) {

				System.out.print("  ");
				System.out.print(i);
				System.out.print("  ");
				// System.out.println("switch");
				// System.out.println(High);
				Thread.sleep(1000);
			}
		} else {
			System.out.println("no match found");
		}
	}

	public static StopWatch getInstance() {
		if (instance == null) {
			instance = new StopWatch();

		}
		return instance;
	}
}
