import java.util.Scanner;

public class TemperatureConvert {
	
	public static double tempConverterFtoC(int fahrenheit){
		
		double celsius =  ((fahrenheit - 32) * (double)5/9) ;
		return celsius;
	}

}
