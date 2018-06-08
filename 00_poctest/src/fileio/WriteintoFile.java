package fileio;
import java.io.FileReader;
import java.io.IOException;

public class WriteintoFile {

	public static void main(String[] args) throws IOException {
		createfile();
	}
	public static void createfile() throws IOException {
		FileReader fr = new FileReader("D:\\iotest\\abc.txt");
		for (int i = fr.read(); i != -1; i = fr.read()) {
			System.out.print((char) i);
		}
		fr.close();
	}
}
// D:\iotest
