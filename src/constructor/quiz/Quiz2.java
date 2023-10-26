package constructor.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.company = "기아";
		car1.model = "레이";
		car1.color = "흰색";
		car1.maxSpeed = 150;
		
		Car car2 = new Car("현대", "쏘나타", "흰색", 200);
	}
}

class Car{
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Car(){
		
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
