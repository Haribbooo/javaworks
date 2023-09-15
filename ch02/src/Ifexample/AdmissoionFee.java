package Ifexample;

import java.util.Scanner;

public class AdmissoionFee {

	public static void main(String[] args) {
		//놀이공원 입장료 계산
		// 치약 전 아동 = 1000 , 초등학생 =2000 , 중고등 = 2500, 일반=3000
		// 변수 - 나이 age , 입장료 fee
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : " )
		;
		int age= 9;
		int fee = 0;
		
		if(age < 8 ) {
			fee = 1000;
			System.out.println("취학 전 아동입니다");
		}else if(age >= 8 && age < 14) {
			fee = 2000;
			System.out.println("초등학생입니다.");			
		}else if(age >= 14 && age < 20) {
			fee = 2500;
			System.out.println("중고등학생입니다.");
		}else {
			fee =3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + fee+ "원 입니다.");
		
		
			
		}

}
