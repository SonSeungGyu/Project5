package hiding.test2;

//다른 패키지에 있는 클래스를 사용할 때는 import문 선언해야함
import hiding.test1.A;

public class Test {
	public static void main(String[] args) {
		A a = new A();// 외부 패키지에서 사용 가능
//		B b = new B();//default 접근제어자를 가지고 있어 외부 패키지에서 사용 불가능.
		
		
	}
}
