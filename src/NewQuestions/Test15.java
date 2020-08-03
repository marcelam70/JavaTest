package NewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Test15 {

	public static void main(String[] args) {
	   List <Integer> list = new ArrayList<>();
	   list.add(110);
	   list.add(new Integer(110));
	   list.add(110);
	   
	   
	   list.removeIf(i->i==110); //Output = [] this removeIf removed all 110 
	   System.out.println(list);
	}

}
