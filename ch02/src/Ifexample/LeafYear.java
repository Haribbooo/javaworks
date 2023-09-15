package Ifexample;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		// 윤년을 판정해주는 프로그램
		// 4년에 한번씩 윤년. 4의 배수 -- 나머지 연산자 % 사용)
		// 윤년의 추가 조건 - 100년 단위는 윤연이 아니다. + 400년 단위는 윤년이다.
		// 변수- 연도(year)
		Scanner sc =new Scanner(System.in);
		System.out.print("년도 입력: ");
		
		int year = sc.nextInt();
		
		
		if(year % 4 ==0 && year %100 != 0|| year % 400 ==0) {//4년에 한번씩 윤년+100년 단위는 윤연이 아니다.
			System.out.println(year +" 년은 윤년입니다.");
		}else { // 나머지가 1 2 3 인경우
			System.out.println(year +" 년은 평년입니다.");
		}
		sc.close();
		
		
	}

}
