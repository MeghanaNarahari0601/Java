package tutorial22;

class Machine{
	private String name;
	private int code;
	
	public Machine(){
		this("Arnie",0);
		System.out.println("Constructor running");
	}
	
	public Machine(String name){
		this(name,0);
		
		System.out.println("second constructor running");
		this.name = name;
	}
	public Machine (String name, int code){
		System.out.println("third constructor is running");
		this.name = name;
		this.code = code;
	}
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m1 = new Machine();
		Machine m2 = new Machine("Bertire");
		Machine m3 = new Machine("Chalky", 7);
	}

}
