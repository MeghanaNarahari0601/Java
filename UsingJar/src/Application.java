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
		
		Math m1 = new Math();
		int answer = m1.findLCM(num1, num2);
		System.out.println(answer);

	}

}
