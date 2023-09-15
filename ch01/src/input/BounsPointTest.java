package input;

import java.util.Scanner;

public class BounsPointTest {

	public static void main(String[] args) {
		// 고객의 이름과 구매 금액을 입력받고
		// 이름과 구매포인트 출력
		// 구매포인트(bonusPoint) = 상품가격(price) * 포인트적립율(bonusRatio)
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요:");
		String customer =sc.nextLine(); // 사용자 이름입력
		
		
		System.out.print("구매 금액을 입력하세요:");
		int price = sc.nextInt();
		double bonusRatio = 0.02;
		int bonusPoint = 0;   //double로 하면  밑에 식에 형변환을 할 필요는 없다.
		
		//계산 처리 
		bonusPoint = (int)(price * bonusRatio); //정수형으로 형변환을 강제로함 =명시적 형변환
		
		
		//출력
		System.out.println(customer + "님의 보너스 포인트는" +bonusPoint+"점입니다.");
		
		sc.close();
		
	}

}
