package arrarycopy;

public class ShallowCopy {

	public static void main(String[] args) {
		// 얕은 복사
		Book[] arry1 = new Book[3];
		Book[] arry2 = new Book[3]; // null null null 상태임 
		
		//바로 입력 하고 저장
		arry1[0] = new Book("누가 내머리위에 똥쌌어", "파주 책좋은 출판사");
		arry1[1] = new Book("무서운게 딱 좋아!", "최은호");
		arry1[2] = new Book("무인도에서 살아남기", "베어그릴스");
		//arry1의 첫번재 요소 수정
		arry1[0].setBookName("아리랑1");
		arry1[0].setAuthor("윤태호");
		
		
		//arry 2를 배열 복사 (일반 복사)
		for(int i =0 ; i< arry1.length; i++) {
			arry2[i]=arry1[i];
		}
		//arry 2 출력
		for(int i =0 ; i< arry1.length; i++) {
			System.out.println(arry2[i].toString());
			}
	
	}//main

}//class
