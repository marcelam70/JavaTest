package JavaQuestions20;

import java.util.ArrayList;
import java.util.List;

public class Question26 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Brian");
		names.add("Rick");
		names.add("Bran");
		if(names.remove("Bran")){
			names.remove("Jon");
		}
		System.out.println(names);// Robb,Brian,Rick
		

	}

}
