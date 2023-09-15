package constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		// km 를 입력받아 MILE 로 출격하는 프로그램
		// 변환 상수 ; 1 mile = 1.609344	
		// 변수 - kph , mph 
		
		Scanner scanner = new Scanner(System.in);
		
		final double RATE_KHP_MPH = 1.609344;
		double mph = 0.0;
		
		System.out.print(" 구속을 입력하세요(km/h) : ");
		double kph = scanner.nextDouble();
		
		
		
		//연산
		//mile = km / 변환상수
		mph = kph / RATE_KHP_MPH;
		
		
		//출력
		System.out.printf("공의 속도는 %.2f 입니다", mph );
		//System.out.println("공의 속도는 " + mph+ " mile 입니다.");
		scanner.close();
	}//main 끝

}//class 끝
