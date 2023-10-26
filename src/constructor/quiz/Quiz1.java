package constructor.quiz;

public class Quiz1 {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "스프링부트";
		book1.price = 30000;
		book1.company = "한빛출판사";
		book1.pages = 200;

		Book book2 = new Book("자바프로그래밍",10000,"금빛출판사",300);
	}
}

class Book{
	String title;
	int price;
	String company;
	int pages;
	
	//default constructor
	public Book() {
	}

	public Book(String title, int price, String company, int pages) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.pages = pages;
	}
}
