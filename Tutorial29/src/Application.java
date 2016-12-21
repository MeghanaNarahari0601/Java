import world.Plant;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID); 
		
		//won't work--type is private
		//System.out.println(plant.type);
		
		//wont work--size is protected; app not in same package as plant
		//womt work
		//System.out.println(plant.size);
	}

}
