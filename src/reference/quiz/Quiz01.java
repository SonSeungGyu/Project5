package reference.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		Book book4 = new Book("아",20000,"한",200);
		Book book5 = new Book("에",30000,"한",300);
		Book book6 = new Book("이",40000,"한",400);
		Member mem = new Member(1001,"ssg",book4,book5,book6);
		mem.method(book4);
		System.out.println(mem.toString());
		
	}
}

class Member{
	int memberNo;
	String name;
	Book book1;
	Book book2;
	Book book3;
	
	public Member(int memberNo, String name, Book book1, Book book2, Book book3) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
	
	
	public void method(Book book) {
		book.price = 100000;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", name=" + name + ", book1=" + book1 + ", book2=" + book2 + ", book3="
				+ book3 + "]";
	}
	
}

class Book{
	String title;
	int price;
	String company;
	int pages;
	
	public Book(String title, int price, String company, int pages) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", company=" + company + ", pages=" + pages + "]";
	}
	
	
}
