package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		ForEachMethod.java8foreachmethod();
	}
	static void java8foreachmethod() {
		List<String> alphabet = new ArrayList<>(Arrays.asList("AA", "BB", "CC", "DD"));
		//alphabet.forEach(System.out.print(alphabet));
		//forEach(a -> System.out.println(a));

	}
}
