package multithreading_race_condition_2;

class RaceTest {

	public static void main(String[] args) {
		RunnableThread runnableThread = new RunnableThread();

		Thread thread = new Thread(runnableThread);
		System.out.println();thread.setName("thread 1");
		
		Thread thread1 = new Thread(runnableThread);
		thread1.setName("thread1");
		
		Thread thread2 = new Thread(runnableThread);
		thread2.setName("thread2");

		thread.start();
		thread1.start();
		thread2.start();
	}

}
