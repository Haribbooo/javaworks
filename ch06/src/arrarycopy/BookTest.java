package arrarycopy;

public class BookTest {

	public static void main(String[] args) {
		
		//객체를 담을(저장할) 크기가 n인 배열을 생성함
		Book[] books = new Book[3]; //배열의 크기가 3인 배열 만들기
		
		//객체를 n번 생성 
		Book book1 = new Book("누가 내머리위에 똥쌌어", "파주 책좋은 출판사");
		Book book2 = new Book("무서운게 딱 좋아!", "최은호");
		Book book3 = new Book("무인도에서 살아남기", "베어그릴스");
		
		
		//인덱스의 순서에 따라서 저장
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		/*for 문으로 저장해보는 시도!
		for(int i = 0; i<books.length;i++) {
			books[i]=book(i+1);
		}*/ // 안된다!! 하지마라 포기포기
		
		//출력해봄 확인용으로 1개만!
		//System.out.println(books[2]);
		
		//전체 출력
		for(int i = 0; i< books.length; i++) {
			System.out.println(books[i]);
		}
	
		
		//System.out.println(book1);
		//System.out.println(book1.toString());
	}

}
