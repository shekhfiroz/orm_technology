package multithreadingpractice;

public class Multi extends Thread {

	public void run() {
		System.out.println("run is executed");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Multi multi = new Multi();
		//multi.run();
		multi.start();
	}

}
