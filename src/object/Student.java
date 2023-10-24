package object;
/*
	학생 클래스 만들기
*/

public class Student {
	//학생의 속성을 멤머 변수로 선언
	int studentId; //학번
	String studentName;//이름
	int grade;//학년
	String address; //주소
	
	
	//학생의 기능을 메소드로 선언
	public void goSchool() {
		System.out.println("학교에 간다");
	}
	
	public void study() {
		System.out.println("공부를 한다");
	}
	
	
}
