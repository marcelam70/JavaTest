package Questions41;

public class Q52 {

	public static void main(String[] args) {
		String[] strs = new String[2];
		int idx = 0;
		for(String string : strs){
			strs[idx].concat("element" + idx);
			idx++;
		}
		for(idx=0; idx<strs.length;idx++);
		System.out.println(strs[idx]);
//Exception in thread "main" java.lang.NullPointerException
	/* Explanation: The JVM throws a null pointer exception because a method (concat())
 *  is called on an object containing null.
 *  Note that the print() method does not cause JVM to throw an exception and prints null. */
	}

}
