package JavaQuestions1;
public class CheckinAccountQ17 {
	public int amount;
	public CheckinAccountQ17(int amount){
		this.amount=amount;}
	public int getAmount(){
		return amount;
	}
	public void setAmount(int amount){
		this.amount = amount;
		
	}
	public void changeAmount(int x){
		amount +=x;	}	 
		public static void main(String[] args) {
			CheckinAccountQ17 acct =new CheckinAccountQ17 ((int)(Math.random()*1000));
			  System.out.println((Math.random()*1000));
				//line n1
				 //A
				//this.amount=0;//this no in static
				 //B
			//	amount=0;//amount change to static
				 //C
     		//	acct(0);//created method acc(int)
				 //D
				acct.amount=0;//this work
				 //E
				// acct.getAmount()=0;//left side need variable
				 //F
				acct.changeAmount(0);//work
				 //G
				acct.changeAmount(-acct.amount);//work and balance is zero
				 //H
				acct.changeAmount(-acct.getAmount());//work and balance is zero
				acct.setAmount(0);
				System.out.println(acct.getAmount());
				//System.out.println(-acct.amount);
				//Answer D and work good F G H
		}
}
