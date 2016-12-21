import java.util.ArrayList;
import java.util.HashMap;

class animal{
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////Before Java 5//////////////////////////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("orange");
		list.add("grape");
		
		String fruit = (String)list.get(1);
		
		System.out.println(fruit);
		
		//////Modern style/////////////////////////////////////
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		////////////There can be more that one type argument////////////////
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		/////////Jave 7 style/////////////////
		
		ArrayList<animal> someList = new ArrayList<>();
		
	}

}
