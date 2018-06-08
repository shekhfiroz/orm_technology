package fileio;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		createfile();

	}
	public static void createfile() throws IOException {
		File f=new File("hello");
		f.mkdir();
		
		File f1 = new File(f,"hello3.txt");
		f1.createNewFile();
	}
	//D:\iotest
	
	
}
