package jsondata.string;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		
		//문자의 길의 length 함수
		//String personId = "850212 - 1043234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요: " );
		String personId = sc.nextLine();
		
		
		//System.out.println(personId.length());
		
		//문자를 추츨할때 substring 함수 
		String yyymmdd = personId.substring(0,6);
		System.out.println(yyymmdd);
		
		//7번 인덱스 부터 끝까지
		String secondNum = personId.substring(7);
		System.out.println(secondNum);
		
		char 성별 = personId.charAt(7);
	
		if(personId.length() == 14) {
			
		}else if(성별 == '1' || 성별 =='3') {
			System.out.println("남자");
		}else if(성별 == '2' || 성별 =='4') {
			System.out.println("여자");
		}else {
			System.out.println("잘못된 주민번호 입니다");
		}

	}
}
