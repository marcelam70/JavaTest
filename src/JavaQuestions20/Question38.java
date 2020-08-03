package JavaQuestions20;

public class Question38 {

	public static void main(String[] args) {
		double discount = 0;
		int qty = Integer.parseInt(args[0]);
		//A correct answer
		if(qty >=90){ discount=0.5; }
		if(qty>80 && qty <90){ discount =0.2;}
		
		//B
		discount= (qty >=90) ? 0.5 : 0;
		discount= (qty>80)? 0.2 :0;
		
		//C correct answer
		discount =(qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
		//D
		if (qty>80 &&qty<90) {
			discount = 0.2;
			
		}else{
			discount=0;
		}
		if (qty>=90) {
			discount=0.5;
			
		}else{
			discount=0;
			//E
			discount=(qty>80)?0.2:(qty>=90)?0.5:0;
		}

	}

}
