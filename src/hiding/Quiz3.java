package hiding;

public class Quiz3 {
	public static void main(String[] args) {
		MyDate2 date = new MyDate2();
		date.setMonth(12);
		int month = date.getMonth();
		System.out.println("현재는 " + month + "월 입니다.");
		
		date.setMonth(15);
		System.out.println("현재는 " + month + "월 입니다.");
		
		
		
	}
}


