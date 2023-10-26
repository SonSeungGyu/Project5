package instance.quiz;

import java.util.Date;

public class Quiz2 {
	public static void main(String[] args) {
		Order order = new Order();
		order.orderNo = 1111;
		order.date = "2018년 3월 12일";
		order.name = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();
		
		Date date = new Date();
		System.out.println(date);
		date.setMonth(12);
		System.out.println(date);
	}
}

class Order{
	int orderNo;
	String date;
	String name;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문번호: " + orderNo + ", 주문날짜: " + date + ", 주문자이름: " + name + ", 배송지: " + address );
	}
}
