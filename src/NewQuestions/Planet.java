package NewQuestions;

public class Planet {
	public String name;
	public int moons;
	public Planet(String name, int moons) {
		this.name = name;
		this.moons = moons;
		
	}

	public static void main(String[] args) {
	Planet [] planets ={new Planet("Mercury", 0),new Planet("Venus", 0), new Planet("Earth", 1), new Planet("Mars", 2),};
	     
	        System.out.println(planets);
	      System.out.println(planets[2].name);
	     // System.out.println(planets[2]);
	       System.out.println(planets[2].moons);// output 1 
	       
	         
       //   Output = [LNewQuestions.Planet;@7852e922            
	   //  NewQuestions.Planet@4e25154f
	 //    1
	       
	       //second with numbers 0012 = [LNewQuestions.Planet;@7852e922
	                                   // Earth
	                                   // 1
	}

}
