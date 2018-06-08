package multithreadingpractice;

public class Sleeptest extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I am in run method");

		}
	}

	public static void main(String[] args) throws InterruptedException {

		Sleeptest st = new Sleeptest();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);

		t1.start();
		t2.start();
	}

}
