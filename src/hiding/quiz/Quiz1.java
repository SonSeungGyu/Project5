package hiding.quiz;

public class Quiz1 {
	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book();
		
		book.setTitle("자바프로그래밍");
		book.setPrice(20000);
		book.setCompany("한빛컴퍼니");
		book.setPage(300);
		System.out.println("제목 : "+ book.getTitle() + ", 가격 : " + book.getPrice() + ", 출판사 : " + book.getCompany()
		+ ", 페이지수 : " + book.getPage());

		book1.setTitle("스프링");
		book1.setPrice(15000);
		book1.setCompany("한빛컴퍼니");
		book1.setPage(500);
		System.out.println("제목 : "+ book1.getTitle() + ", 가격 : " + book1.getPrice() + ", 출판사 : " + book1.getCompany()
		+ ", 페이지수 : " + book1.getPage());
	}
}


class Book{
	String title;
	int price;
	String company;
	int page;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}
