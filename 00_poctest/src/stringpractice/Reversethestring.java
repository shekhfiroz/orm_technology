package stringpractice;

public class Reversethestring {

	public static void main(String[] args) {
		Reversethestring.reverserastring();
	}
	public static void reverserastring() {
		String str="hellospring";
		String str1="";
		for(int i=0;i<=str.length();i++) {
			str1=str.charAt(i)+str1;
			//System.out.println(str1);
		}
		System.out.print(str1);
	}
	

}

