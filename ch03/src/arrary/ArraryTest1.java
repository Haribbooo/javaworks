package arrary;

public class ArraryTest1 {

	public static void main(String[] args) {
		// 변수
		String car1 = "Sonata";
		String car2 = "Morning";
		String car3 = "K7";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println("=======================");//
		
		// 배열- 순서가 있음, 중복도 가능
		// 직접 저장 - 중괄호 {} 사용
		String[] cars = {"Sonata","Morning","K7","K7"};
		//String[] cars =  new String[]{"Sonata","Morning","K7","K7"};
		System.out.println(cars[1]);
		
		System.out.println("=======================");//
		
		//배열의 크기(개수로 따지면 4가 나와야됨) 배열 이름처럼.length 암기
		System.out.println("배열의 크기 :" + cars.length);
		
		
		//for 문 - 전체 조회
		for(int i = 0 ; i < cars.length ; i++) {
			System.out.println(cars[i]);
		}
		
	} //main

}//class
