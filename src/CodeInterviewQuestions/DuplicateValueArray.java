package CodeInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValueArray {

	public static void main(String[] args) {
		String names[] = {"Dylan","Jake","Marco","Dieguito","Lucas","Jorge","Dylan","Jake","Dieguito"};
		//int[] names = {1,2,2,3,4,5,5,67};
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
			if (names[i].equals(names[j])) {
				//if(names[i]== names[j])
				
					System.out.println(names[i]);
					
				}
//			
//				Set<String> store = new HashSet<String>();
//				for(String name :names ){
//					if(store.add(name)== false)
//						System.out.println(name);
				}
				
			}
			
	}	

	}


