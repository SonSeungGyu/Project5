package method;

public class Quiz6 {

	public static int cal(int a, int b, char c) {
		int val = 0;
		switch(c) {
		case '+':
			val = a + b;
			break;
		case '-':
			val =  a - b;
			break;
		case '*':
			val = a * b;
			break;
		case '/':
			val = a / b;
			break;
		}
		return val;
	}
	
	public static void cal1(int a, int b, char c) {
		switch(c) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		}
		
	}
	
	public static int cal2(int a, int b, int c) {
		int val;
		if(c=='+') {
			val = a + b;
		}else if(c=='-') {
			val = a - b;
		}else if(c=='*') {
			val = a * b;
		}else {
			val = a / b;
		}
		return val;
	}
	
	public static void main(String[] args) {
		System.out.println(cal2(6,3,'/'));
		cal1(3,4,'+');
	}
}
