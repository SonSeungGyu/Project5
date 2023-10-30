package hiding.test2;

public class Test2 {
	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "둘리"; //어디에서든 사용 가능
		person.height = 170;//같은 패키지내에서 사용 가능
//		person.weight = 1.2;//private는 클래스 외부에서 사용불가
	}
}

class Person{
	public String name;
	int height;
	private double weight;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
}
