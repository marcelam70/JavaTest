package NewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(100);
		list.add(200);
		list.remove(100); //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 100, Size: 4
		
		System.out.println(list);

	}

}
