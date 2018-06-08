package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("pattern1");
		Pattern1 pattern1 = new Pattern1();
		pattern1.pattern1();
	}
	public void pattern1() {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j>=1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
