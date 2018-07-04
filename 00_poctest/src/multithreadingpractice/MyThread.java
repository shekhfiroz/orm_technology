package multithreadingpractice;

public class MyThread extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		// mt.run();
		Thread t = new Thread(mt);
		t.start();
	}

}
