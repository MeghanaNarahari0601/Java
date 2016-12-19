package loopNumberAdd;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
	 int[] numbers = new int[10];
		
		for(int i=0;;i++){
			
			System.out.println("Please enter a number:");
			Scanner s1 = new Scanner(System.in);
			int input = s1.nextInt();
			numbers[i] = input;
			
			if(input == 0){
				Math m1 = new Math();
				total = m1.add(numbers);
				break;
			
			}
			
		}
		
		System.out.println(total);
		
	}

}
