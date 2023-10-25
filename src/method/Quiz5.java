package method;

public class Quiz5 {
	public static void division(int a, int b) {
		if(b==0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return; //return이 없으면 런타임에러 발생,, 값이 없는 return을 주어야 함수 정상 종료. 
		}
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		division(5,0);
		Hello();
	}
	
	public static void Hello() {
		System.out.println("hello");
		return;
	}
}

