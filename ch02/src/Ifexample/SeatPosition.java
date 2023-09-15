package Ifexample;

import java.util.Scanner;

public class SeatPosition {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석의 줄 수 (행) 계산
		// 변수 - customer , column( 열수), row 줄수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수 입력: ");
		int customer = sc.nextInt();
		
		System.out.print("좌석 수 입력: ");
		int column = sc.nextInt();
		
		int row= 0;
		
		//연산 lf else문
		
		if(customer % column ==0) {
			row= customer / column; // row 는 몫
		}else {
			row= customer / column +1;
	}
	
		System.out.println(row+"줄이 필요합니다");
		sc.close();

 }
}