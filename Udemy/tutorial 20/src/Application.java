class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	public void jump(int height){
		System.out.println("Jumping" + height);
	}
	public void move(String direction, double distance){
		System.out.println("Moving" + distance + "metres in direction" + direction);
	}
 }
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot sam = new Robot();
		
		sam.speak("HI, I'm Sam");
		sam.jump(7);
		sam.move("West", 12.2);
		String greeting = "Hello there";
		sam.speak("greetings");
		int value = 14;
		sam.jump(value);
		

	}

}
