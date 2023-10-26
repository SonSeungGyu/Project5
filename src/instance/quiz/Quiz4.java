package instance.quiz;

public class Quiz4 {
	public static void main(String[] args) {
		Car car = new Car();
		car.showStatus();
		car.setStatus(true);
		car.showStatus();
	}
}

class Car{
	boolean status;
	
	public  void setStatus(boolean stt){
		status = stt;
	}
	
	public void showStatus(){
		System.out.println(status);
	}
}
