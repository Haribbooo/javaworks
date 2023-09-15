package basicclass;

public class Book {
	int bookNumber; // 책 번호
	String bookTitle; // 책  타이틀
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;		
	}
	//매서드 재정의
	@Override
	public String toString() {
		return bookTitle+","+bookNumber;
	}
	
	
	
}
