package input;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// 입력처리 -scanner 클래스사용
		// 문자는 nextLine()
		// 숫자는 nextInt()
		Scanner scanner = new Scanner(System.in); // 외부에서 가져오는 거 import, 열어재낌 
		
		System.out.print("이름 입력: ");
		String name = scanner.nextLine(); //문자열 입력 숫자도 포함댐
		
		System.out.print("나이입력: ");
		int age = scanner.nextInt(); // 숫자만되고 문자는 안됌
		
		
		System.out.println("이름은 " + name+ ", 나이:" + age);
		
		
		scanner.close(); // 닫아줘야댐 (권장사항)

	}

}
