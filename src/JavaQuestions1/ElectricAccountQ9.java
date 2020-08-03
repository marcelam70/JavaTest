package JavaQuestions1;

class Customer{
	ElectricAccountQ9 acct = new ElectricAccountQ9();
	public void useElecstricity(double kWh){
		
	}
	}
public class ElectricAccountQ9{
	private double kWh;
	private double rate = 0.07;
	private double bill;
	
	//A
	  public void addKWhA(double kWh){
		this.kWh += kWh;
		this.bill = this.kWh*this.rate;
	  }	
		//B
		//public void addKWhB(double kWh) {
			//if (kWh >0) {
				//this.kWh += kWh;
				//this.bill = this.kWh*this.rate;
	  //C
		private void addKWhC(double kWh) {
		if (kWh >0) {
		this.kWh += kWh;
		this.bill = this.kWh*this.rate;	}
		}
		//D
		//public void addKWhD(double kWh) {
		//	if (kWh >0) {
		//		this.kWh += kWh;
		//	setbill = (this.kWh);
				
		//	}
		//	public void setBill(double kWh){
		//		bill = kWh*rate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
