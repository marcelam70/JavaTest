package JavaQuestions1;
class Product{
	double price;
}
    public class TestQ1 {
    	
           public void upDatePrice(Product product, double price){
	        price = price *3;//200*2=400.0
	         product.price =product.price + price;
}
	public static void main(String[] args) {
		 Product product = new Product();
		 product.price = 200; 
		 double newPrice = 100;//this not change 100.0
		 
		 TestQ1 t = new TestQ1();
		 t.upDatePrice(product, newPrice);
		 System.out.println("Answer C:" + product.price + ":" + newPrice);

	}

}
