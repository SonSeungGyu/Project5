package instance;

public class Ex1 {
	public static void main(String[] args) {
		Student st = new Student();
		// st(참조변수)는 Student 객체의 주소값을 가지고있음.
		st.studentId = 1001;
		st.studentName = "둘리";
		st.grade = 2;
		st.address = "인천 남동구";
		
		System.out.println("학생의 모든 정보를 출력합니다.");
		System.out.println("stdentId = " + st.studentId);
		System.out.println("stdentName = " + st.studentName);
		System.out.println("grade = " + st.grade);
		System.out.println("address = " + st.address);
		System.out.println("==================================");
		st.showStudentInfo();
		System.out.println("==================================");
		System.out.println("객체의 주소는 " + st + " 입니다.");
	}
}
