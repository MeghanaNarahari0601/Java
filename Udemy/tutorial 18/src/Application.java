
class Person{
	String name;
	int age;
	
	void speak(){
		for(int i=0; i<3 ; i++){
			System.out.println("my name is:" + name + "and i am" + age + "years old");
			
		}
	}
	
	void sayHello(){
		System.out.println("hello there");
	}
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		person1.sayHello();
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		person1.speak();
		person1.sayHello();
		
		
		System.out.println(person1.name);
	}

}

