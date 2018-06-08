package multithreading_race_condition_2;

class SharedResource {
	public int shared_var = 10;

	public   void increment() {
		for (int i = 0; i < 5; i++) {
			System.out.println(" incremented shared_var===>  " + (shared_var + i));
			// System.out.println(thread.getClass().getName().hashCode());
		}
	}

	public  void decrement() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Decremented shared valued  " + (shared_var - i));
		}

	}
}
