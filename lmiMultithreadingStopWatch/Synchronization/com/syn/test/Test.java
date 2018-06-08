package com.syn.test;

import com.syn.runable.Clock;

public class Test {
	public static void main(String[] args) {	
	
	Clock clock = new Clock();
	
	Thread t = new Thread(clock,"50");
	Thread t1 = new Thread(clock,"40");
	t.start();
	t1.start();
	
	//System.out.println(t.getStackTrace());
	//System.out.println(t1.getStackTrace());
	
	}

}
