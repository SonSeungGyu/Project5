package method;

public class Quiz7 {

	public static int q(int a) {
		int a1 = a/100;
		int a2 = a%100/10;
		int a3 = a%10 ;
		
		return a1 + a2 + a3;
	}
	
	
	public static void main(String[] args) {
		System.out.println(q(123));
	}
}
