package world;

public class Oak extends Plant {
	
	public Oak(){
		
		//won't work--type
		//type = "tree";
		
		//this works---because size i protected and oak is a subclass of plant
		this.size = "large";
		
		//no access specifior ; works because oak and plant in same pakage
		this.height = 10;
	}

}
