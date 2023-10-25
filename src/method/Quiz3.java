package method;

public class Quiz3 {

	public static int hap(int a, int b) {
		int sum=0;
		for(int i=a ;i<=b;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(hap(1,10));
	}
}
