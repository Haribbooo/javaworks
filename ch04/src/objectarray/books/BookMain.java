package objectarray.books;

public class BookMain {

	public static void main(String[] args) {
		//Book[] lib = new Book[3]; // 배열 Book의 3자리 수를 설정
		
		
		/*for(int i =0; i < lib.length; i++) {
			System.out.println(lib[i]);
		}
		
		//객체 생성 (배열 저장)
		lib[0] = new Book("누가 내 머리위에 똥쌌어?!", "진학사");
		lib[1] = new Book("죄와벌", "톨스토이");
		lib[2] = new Book("연탄길", "고금자");
		*/
		
		//배열 생성
		Book[] lib= {
				new Book("누가 내 머리위에 똥쌌어?!", "진학사"),
				new Book("죄와벌", "톨스토이"),
				new Book("연탄길", "고금자")
		}; //세미콜론 종료
		
		
		//출력
		lib[0].showBookInfo();
		
		//전체출력
		for(int i = 0; i < lib.length; i++) {
			//lib[i].showBookInfo(); // print 하면 안됨 이거 자체가 프린트임
			System.out.println(lib[i].showBookInfo());
		}
		System.out.println("==========================");
		
		//향상된 for 문
		//for(Book book :lib) ( 자료형 변수 : 배열)
		for(Book book: lib)
			//System.out.println(book.showBookInfo());
			book.showBookInfo();
	}

}
