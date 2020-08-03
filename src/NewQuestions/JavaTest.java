package NewQuestions;

import java.util.ArrayList;
import java.util.List;

public class JavaTest {

	public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(); 	
        elements.add(10);
       
        int firstEelemnt = elements.get(1);//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
        System.out.println(firstEelemnt);

	}

}
