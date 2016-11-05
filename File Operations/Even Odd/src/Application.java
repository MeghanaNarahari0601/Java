import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value: ");
		int value = input.nextInt();
		
		int remainder = value % 2  ;
		if (remainder == 1 ){
			System.out.println("The number is odd");
		}
		else{
			System.out.println("The number is even");
		}

	}

}
