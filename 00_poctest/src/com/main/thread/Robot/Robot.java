package com.main.thread.Robot;

public class Robot {
	public static void main(String[] args) {


		//Robot robot=new Robot();
				
	}

	
	
	static{
		Thread t = new Thread() {
			public void run() {

				System.out.println("runn : " + this.getClass().getSuperclass());
			}

		};
		t.start();

	}
}
