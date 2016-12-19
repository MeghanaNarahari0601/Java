import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number:");
		Scanner s1 = new Scanner(System.in);
		int celsius = s1.nextInt();
		
		TempConverter t1 = new TempConverter();
		double fahrenheit = t1.tempConverterCtoF(celsius);
		
		System.out.println("this number in Fahrenheit is: " + fahrenheit);
	}

}
