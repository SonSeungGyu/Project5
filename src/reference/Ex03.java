package reference;

public class Ex03 {
	public static void main(String[] args) {
		int num = 10;
		method1(num);
		System.out.println(num);
		
		Subject math = new Subject("수학", 100);
		method2(math);
		System.out.println(math.toString());
	}
	
	public static void method1(int n) { //기본형 매개변수
		n = 5; //값 변경
	}
	
	public static void method2(Subject sub) { //참조형 매개변수
		sub.scorePoint = 50; //점수 변경
	}
}
