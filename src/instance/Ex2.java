package instance;

public class Ex2 {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.studentId = 1001;
		st1.studentName = "둘리";
		st1.grade = 2;
		st1.address = "인천";
		st1.showStudentInfo();
		System.out.println("객체의 주소는 " + st1 + " 입니다.");
		System.out.println();
		
		Student st2 = new Student();
		st2.studentId = 1002;
		st2.studentName = "또치";
		st2.grade = 3;
		st2.address = "서울";
		st2.showStudentInfo();
		System.out.println("객체의 주소는 " + st2 + " 입니다.");
	}
}
