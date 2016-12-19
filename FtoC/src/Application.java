import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number:");
		Scanner s1 = new Scanner(System.in);
		int fahrenheit = s1.nextInt();
		
		TemperatureConvert t1 = new TemperatureConvert();
		double celsius = t1.tempConverterFtoC(fahrenheit);
		
		System.out.println("this number in celsius is: " + celsius);
		
		
		
		
		
		
		
	}

}
