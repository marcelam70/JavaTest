package Questions41;

public class PlanetsQ59 {
       public String name;
       public int moons;
       public PlanetsQ59(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}
	public static void main(String[] args) {
		PlanetsQ59 [] planets = {new PlanetsQ59("Mercury" , 0),
				                     new PlanetsQ59("Venus" , 0),
				                     new PlanetsQ59("Earth" , 1),
				                     new PlanetsQ59("Mars" , 2)};
		
                 System.out.println(planets);
                 System.out.println(planets[1]);
                 System.out.println(planets[2].moons);
                 //Answer
                 //[LQuestions41.PlanetsQ59;@7852e922
                // Questions41.PlanetsQ59@4e25154f
                // 1
	}
}

