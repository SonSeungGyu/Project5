package instance;

public class Student {
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println("학번:" + studentId + ", 이름:" + studentName + ", 학년:" + grade + ", 주소:" + address);
	}
	
}
