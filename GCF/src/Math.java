
public class Math {
	public static int findGCF(int num1, int num2){
		
		int gcf = -1;
		
		 for(int i = num1 ; i>0 ; i--){
		    	int remainder = num1 % i; 
		    	
		    	if(remainder == 0){
		    		int remainder2 = num2 % i;
		    		if(remainder2 == 0){
		    			System.out.println(i + " is the GCF");
		    			gcf =i;
		    			break;
		    			
		    		}

		    }
		}
		 return gcf;
	}
	

}
