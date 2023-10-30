package hiding;

public class Ex02 {
	public static void main(String[] args) {
		
		MyDate2 date = new MyDate2();
		date.setMonth(2);
		date.setDay(30);
		System.out.println("현재 날짜는 " + date.getMonth() + "월 " + date.getDay() + "일 입니다.");
		
		date.setDay(10);
		System.out.println();
		System.out.println("현재 날짜는 " + date.getMonth() + "월 " + date.getDay() + "일 입니다.");
	}
}

class MyDate2{
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>=1 && month<=12) {
			this.month = month;	
		}else {
			System.out.println("잘못된 월입니다.");
//			return;
		}
		
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("2월에는 " + day + " 일이 없습니다!!");
				return;
			}
		}
		this.day = day;
	}
	
	
	
}
