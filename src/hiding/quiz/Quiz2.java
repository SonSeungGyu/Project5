package hiding.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setBrand("현대");
		car.setModel("소나타");
		car.setBrand("흰색");
		car.setMaxSpeed(200);
		
		System.out.println("제조사 : " + car.getBrand());
		System.out.println("모델 : " + car.getModel());
		System.out.println("색 : " + car.getBrand());
		System.out.println("최고속도 : " + car.getMaxSpeed());
	}
}

class Car{
	String brand;
	String model;
	String color;
	int maxSpeed;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
