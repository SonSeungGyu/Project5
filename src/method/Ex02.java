package method;

public class Ex02 {
	
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int sum = add(a, b);
		
		int sum2 = add(5,5);
		int sum3 = add(10,10);
		
		System.out.println(a + " + " + b + " = " + sum);
	}
}
