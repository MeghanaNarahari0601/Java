import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number: ");
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();
		
		System.out.println("Please enter a number: ");
		Scanner s2 = new Scanner(System.in);
		int num2 = s2.nextInt();
		

	    for(int i = num1 ; i>0 ; i--){
	    	int remainder = num1 % i; 
	    	
	    	if(remainder == 0){
	    		int remainder2 = num2 % i;
	    		if(remainder2 == 0){
	    			System.out.println(i + " is the GCF");
	    			break;
	    		}
	    		else{
	    			
	    		}
	    }
	    
	 
	    

	}

}
}
