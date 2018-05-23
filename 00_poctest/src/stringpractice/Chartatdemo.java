package stringpractice;

public class Chartatdemo {
	public static void reverseastring() {
		
		String s = "spring";
		String s1 = "";
		for (int i = 0; i<s.length(); i++) {
			s1 = s.charAt(i) + s1;
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		Chartatdemo.reverseastring();
	}
}
