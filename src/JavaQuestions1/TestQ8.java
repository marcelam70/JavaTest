package JavaQuestions1;

import java.io.IOException;

class X{
	public void printFileContent() throws IOException{//line 2 add throws IOException
		/*code goes her*/
		throw new IOException();//line 4
	}
}
public class TestQ8 {

	public static void main(String[] args)throws Exception {//line 8 add throws Exception
	   X xobj = new X();
	   xobj.printFileContent();//line 10
	   
	   //A: Add to line 8 with throws Exception//
	   //B: Replace line 10 try{ xobj.printFileContent();
	   //catch(Exception e){}
	   //catch(IOException e){}
	   //C: Add to line 2  throws IOException{//
	   //D: Replace line 4 with throw IOException("Exception raised");
	   //E: At line 11 insert throw new Exception();
	   

	}

}
