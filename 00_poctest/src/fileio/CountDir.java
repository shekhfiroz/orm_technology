package fileio;

import java.io.File;
import java.io.IOException;
public class CountDir {
	public static void main(String[] args) throws IOException {
		createfile();
	}
	public static void createfile() throws IOException {
		int count = 0;
		File f = new File("D:\\iotest");
		String[] s = f.list();

		for (String s1 : s) {
			File f1 = new File(f, s1);
			if (f1.isDirectory()) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("total nos of files " + count);
	}
}
