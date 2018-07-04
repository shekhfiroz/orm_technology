package multithreadingpractice;

public class ThreadWithoutThreadandRunnable {

	static {
		Thread t=new Thread() {
			
			public void run() {
				
				System.out.println("Runnn method");
			}
		};
		t.start();
		
	}
	public static void main(String[] args) {
		

	}

}
