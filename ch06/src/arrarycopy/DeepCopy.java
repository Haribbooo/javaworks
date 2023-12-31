package arrarycopy;

public class DeepCopy {

	public static void main(String[] args) {
		
		Book[] arry1 = new Book[3];
		Book[] arry2 = new Book[3]; // null null null 상태임 
		
		//바로 입력 하고 저장
		arry1[0] = new Book("누가 내머리위에 똥쌌어", "파주 책좋은 출판사");
		arry1[1] = new Book("무서운게 딱 좋아!", "최은호");
		arry1[2] = new Book("무인도에서 살아남기", "베어그릴스");
		
		//기본 생성자로 arry2의 객체를 생성 
		arry2[0] =new Book();
		arry2[1] =new Book();
		arry2[2] =new Book();
		
		//arry1를 arry2에 복사 (setter 와 getter를 쓴다)
		for(int i = 0; i<arry1.length;i++) {
			arry2[i].setBookName(arry1[i].getBookName());
			arry2[i].setAuthor(arry1[i].getAuthor());
		}
		
			
		//aary1원본의 첫번째 요소 수정
		arry1[0].setBookName("아리랑1");
		arry1[0].setAuthor("윤태호");
			
		System.out.println("arry1출력");	
		for(int i = 0; i<arry1.length;i++) {
			System.out.println(arry1[i].toString());
		}
		
		System.out.println("arry2출력");	
		for(int i = 0; i<arry2.length;i++) {
			System.out.println(arry2[i].toString());
		}
		
		//clone() 배열 복사 
		System.out.println("arry3출력");	
		Book[] arry3 = arry2.clone();
		for(int i = 0; i<arry2.length;i++) {
		System.out.println(arry3[i].toString());
		}	
		
		System.out.println("향상 for문 ");
		System.out.println("arry3출력");	
		//for(자료형 변수 : 배열이름) (변수 출력
		for(Book arr3 : arry3) {
			System.out.println(arr3.toString());
		}
	}

	}


