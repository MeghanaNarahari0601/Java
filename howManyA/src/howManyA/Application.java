package howManyA;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter =0;
		
		System.out.println("Please enter a word: ");
		Scanner s1 = new Scanner(System.in);
		String input = s1.nextLine();
		
		
		
		for(int i = 0; i<input.length(); i++){
			if(input.charAt(i) == 'a'){
				counter++ ;
			}
		}
		
		System.out.println("number of a's in the word is:  " + counter);

	}

}
