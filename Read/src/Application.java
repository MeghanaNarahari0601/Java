import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 String fileName = "/Users/Tarun/Java/Read/src/Names";
		 
		 File textFile = new File(fileName);
		 
		 Scanner in = new Scanner(textFile);
		 
		
		 while(in.hasNextLine()){
				String line = in.nextLine();
				
				System.out.println( line);
				
		}
		 
				 in.close();
				 
	}

}
