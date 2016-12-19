package loopNumberAdd;

public class Math {
	public static int add(int[] numbers){
		
		int total = 0;
		
		for(int i=0 ; i<numbers.length ; i++){
			total = numbers[i] + total;
			
		}
		
		return total;
		
		
	}
}
