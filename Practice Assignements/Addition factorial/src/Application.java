import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int k = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value: ");
		int value = input.nextInt();
		
		for (int i=0 ; i <= value ; i++){
			System.out.println(i+ "+");
			 k = k+i;
			 
		}
		System.out.println(k);

	}

}
