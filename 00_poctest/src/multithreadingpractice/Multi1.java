package multithreadingpractice;

public class Multi1 implements Runnable {

	public void run() {
		System.out.println("Implementing Runnable Thread..");
	}

	public static void main(String[] args) {
		Multi1 multi1 = new Multi1();
		Runnable runnable = new Thread(multi1);
		
	}
}
