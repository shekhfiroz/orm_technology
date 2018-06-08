package multithreading_race_condition_2;

public class RunnableThread implements Runnable {
	SharedResource sharedResource = null;

	@Override
	public void run() {

		sharedResource = new SharedResource();
		sharedResource.increment();
		System.out.println("--------------");
		sharedResource.decrement();
	}

}
