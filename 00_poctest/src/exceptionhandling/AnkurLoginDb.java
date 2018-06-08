package exceptionhandling;

public class AnkurLoginDb {

	public static void main(String[] args) {
		AnkurLoginDb.getinfo();
	}

	public static void getinfo() {
		System.out.println("1..Hello");
		try {
			System.out.println(2 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println(3 / 3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("4" + "  " + 4 / 4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("getInfo Method..is completed");
	}

}
