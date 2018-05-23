package hib.poc;

import java.io.IOException;
import java.util.Properties;

public class PrpopertiesTest {

	public static void main(String[] args) throws IOException {
	}

	public static void read() throws IOException {
		Properties props = new Properties();
		props.load(ClassLoader.getSystemClassLoader().getResourceAsStream("resources/db.properties"));
		//props.load(ClassLoader.getSystemClassLoader().getClass().getName().toString());

	}
}
