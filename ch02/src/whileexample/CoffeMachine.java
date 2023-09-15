package whileexample;

import java.util.Scanner;

public class CoffeMachine {

	public static void main(String[] args) {
		// 커피 자동판매기 구현 프로그램
		// 커피 총 개수 - 5개 
		// 커피값 - 500원 투입하면 커피
		// 500원을 초과하면 거스름돈과 커피가 나옴
		// 500원값이 부족하면 커피 안나옴
		// 커피가 다 떨어지면 "판매 종료"
		
		Scanner sc = new Scanner(System.in);
		int coffee = 5;
		
		while(true) {
			System.out.print("돈을 넣어주세요 : ");
			int money = sc.nextInt();
			
			if(money == 500) {
				System.out.println("커피가 나옵니다.");
				coffee -=1; //coffee = coffee -1 
			}else if(money > 500) {
				System.out.println((money-500) + "원을 돌려주고 커피가 나옵니다.");
				coffee -=1;
			}else{
				System.out.println("커피가 나오지 않습니다.");
			}
			System.out.println("남은 커피의 양은 "+ coffee + "개 입니다.");
			
			if(coffee == 0) {
				System.out.println("커피가 모두 소진되었습니다. ");
				System.out.println("=========================");
				System.out.println("판     매     중     지"    );
				break;
			}
		}//while 끝
		sc.close();
	}

}
