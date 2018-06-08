package patterns;

public class Pattern2 {

	public static void main(String[] args) {
		//System.out.println("pattern1");
		Pattern2 pattern2 = new Pattern2();
		pattern2.pattern2();
	}
	public void pattern2() {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
