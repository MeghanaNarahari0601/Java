package loopNumberAdd;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for( ;;){
			
			System.out.println("Please enter a number:");
			Scanner s1 = new Scanner(System.in);
			int input = s1.nextInt();
			
			total = total + input;
			
			if(input == 0){
				break;
			
			}
			
		}
		
		System.out.println(total);
		
	}

}
