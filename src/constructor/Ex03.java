package constructor;

public class Ex03 {
	public static void main(String[] args) {
		Board board = new Board();
		Board board2 = new Board(1, "제목", "내용", "작성자");
	}
}

class Board{
	int no;
	String title;
	String content;
	String writer;
	
	public Board() {
		super();
	}

	public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	
}
