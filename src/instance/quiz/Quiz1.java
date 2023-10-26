package instance.quiz;


public class Quiz1 {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "James";
		person.age = 40;
		person.isMarried = 'o';
		person.child = 3;
		
		
	}
	
}
class Person {
	String name;
	int age;
	char isMarried;
	int child;
}
