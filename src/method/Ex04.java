package method;

/*
	입력한 숫자 만큼 "안녕하세요"를 출력하는 함수를 만들고 호출하기
*/
public class Ex04 {
	public static void printHello(int cnt) {
		for(int i=1;i<=cnt;i++) {
			System.out.println("안녕하세요");
		}
	}
	public static void main(String[] args) {
		printHello(3);
	}
}
