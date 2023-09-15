package arrary;

public class ArraryTest3 {

	public static void main(String[] args) {
		// 크기가 4인 정수 형 배열 선언
		// 정수형은 값이 비어 있으면 0을 출력함 
		
		
		int[] number = new int[4];
		int total = 0;
		double avg; // 평균 = 합계 / 개수
		
		// input
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		
		// self reset
		//int[] number = {10, 20 ,30 ,40} 
		
		//2th index output
		System.out.println(number[2]);
		
		// all index output
		// 합ㄱㅖ 평균 구하기
		for(int i=0; i< number.length; i++) {
			total += number[i];  //누적 합계
			System.out.println(number[i]);
		}
		avg = total / number.length;
		
		System.out.println("합계"+ total);
		System.out.println("평균"+ avg);
		
	}//main

}// class
