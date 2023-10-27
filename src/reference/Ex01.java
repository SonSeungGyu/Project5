package reference;

public class Ex01 {
	public static void main(String[] args) {
//		Subject math = new Subject("수학", 85);
//		Subject korean = new Subject("국어", 100);
//		Student student = new Student(1001, "둘리", math, korean);
//		
//		System.out.println(student.toString());
	}
}


class Subject{
	String subjectName; //과목
	int scorePoint; //점수
	
	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}

//	@Override
//	public String toString() {
//		return "Subject [subjectName=" + subjectName + ", scorePoint=" + scorePoint + "]";
//	}
	
}


class Student{
	int studentId;
	String studentName;
	Subject math;
	Subject korean;

	public Student(int studentId, String studentName, Subject math, Subject korean) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}

//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", math=" + math + ", korean="
//				+ korean + "]";
//	}
	
}
