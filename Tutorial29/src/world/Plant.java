package world;

public class Plant{
	
	//bad practice
	public String name;
	
	//acceptble practice---it's final
	public final static int ID = 8;
	
	protected String size;
	
	private String type;
	
	int height ;
	
	public Plant(){
		this.name = "Freddy";
		type = "plant";
		this.size ="large";
		this.height = 8;
	}
	
}
