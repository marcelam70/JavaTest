package JavaQuestions1;

public class Question15MTExam {
	static int count =0;
	int i =0;
	public void changeCount(){
		while(i<10){
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		Question15MTExam test1 = new Question15MTExam();
		Question15MTExam test2 = new Question15MTExam();
		test1.changeCount();
		test2.changeCount();
		System.out.println(test1.count + ":" + test2.count);
			}

	
	}

