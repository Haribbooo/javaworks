package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// y 키를 입력하면 "출력이 계속 반복"
		// n 키를 입력하면 "출력 멈춤" 
		// else는 "지원하지 않는 키"
		// 문자열 동등 비교함수는 equals()
		//String key = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n) : ");
			String key = sc.nextLine();
			
			//equals
			if(key.equals("y")|| key.equals("Y")) {   // equals 문자가 일치하는 비교 if 아이디비교면 &&
				System.out.println("계속 반복합니다.");
			}else if(key.equals("n")|| key.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;
			}else {
				System.out.println("키를 잘못 눌렀습니다.");
			}
		}
		sc.close();
	}

}
