import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner object
		Scanner input = new Scanner (System.in);
		
		//output the prompt
		System.out.println("Enter a floating point value:");
		
		//wait for the user to enter something
		double value = input.nextDouble();
				
		//tell then what they entered
				System.out.println("You entered: " + value);

	}

}
