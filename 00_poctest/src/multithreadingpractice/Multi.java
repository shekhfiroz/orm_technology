package multithreadingpractice;

public class Multi extends Thread {

	public void run() {
		System.out.println("run is executed");
	}

	public static void main(String[] args) {
		Multi multi = new Multi();
		multi.start();
	}

}
