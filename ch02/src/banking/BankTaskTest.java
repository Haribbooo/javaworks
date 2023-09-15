package banking;

import java.util.Scanner;

public class BankTaskTest {

	public static void main(String[] args) {
		// ATM 기계 만들기
		// 1.예금 2. 출금 3.잔고 4.종료
		//메뉴화면 만들기
		
		
		Scanner sc = new Scanner(System.in);
		int balance = 0;   // 잔고
		boolean sw = true; // 상태변수
				
				
		while(sw) {
			System.out.println("===============================");
			System.out.println("1.예금 | 2.출금 |  3.잔고 |  4.종료");
			System.out.println("===============================");
			
			
			int selNum = sc.nextInt();
			int money = 0; //입금 출금액
			
			switch(selNum) {
			case 1:
				System.out.println("예금액");
				money = sc.nextInt();
				balance += money;
				break;
			case 2:
				System.out.println("출금액");
				money = sc.nextInt();
				if(balance< money) {
					System.out.println("잔액이 부족합니다");
				}else {
					balance -= money;
				}
				break;
			case 3:
				System.out.println("현재 잔고:"+ balance);
				break;
			case 4:
				sw = false;
				break;
			default:
				System.out.println("지원되지 않는 기능");
			}
			
		}
		sc.close();
	} //main

}//class
