package scores;

import java.util.Scanner;

public class CalcSocoreTest {

	public static void main(String[] args) {
		// 성적처리 프로그램
		//입력시 잘못 입력이 있는 경우 - 예외 처리
		// try~ catch 구문 사용
		Scanner sc = new Scanner(System.in);
		boolean sw = true; // 상태변수
		int studentCount = 0; // 학생 수
		int[] scores = null;
		while(sw) {
			try {
				System.out.println("=====================================================");
				System.out.println("1.학생 수 | 2.점 수 |  3.점수리스트 |  4.분석  | 5. 종료"    );
				System.out.println("=====================================================");
				
				//문자를 숫자로 변환 (String, Integer -->int )
				int menu = Integer.parseInt(sc.nextLine()); 
				
				if(menu == 1) {
					System.out.print(" 학생수: ");
					studentCount = Integer.parseInt(sc.nextLine());
					scores = new int[studentCount]; // 학생수는 배열의 크기로 설정
				}else if (menu ==2) { // 2번은 배열의 변수를 저장 (점수를 저장)
					for(int i = 0; i< scores.length; i++) {
						System.out.print("scores["+ i+ "]");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
				}else if (menu ==3) {
					for(int i = 0; i< scores.length; i++) {
						System.out.println("scores["+ i+ "] =" + scores[i]);
					}
				}else if (menu ==4) {
					int sumVal = 0;
					double avg;
					int maxVal = scores[0];
					
					for(int i = 0; i< scores.length; i++) {
						sumVal+= scores[i];
						if(scores[i]> maxVal) {
							maxVal = scores[i];
						}
					}
					avg = (double)sumVal / scores.length;
					System.out.printf("평균 점수 : %.2f 입니다.", avg);
					System.out.println("최고 점수 : " + maxVal + " 입니다.");
				}else if (menu ==5) {
					sw = false;
				}else {
					System.out.println("지원하지 않는 기능 입니다.");
				}			
			}catch(Exception e) {
				System.out.println("올바른 입력이 아닙니다. 숫자를 입력하세요");
			}
			
			
			
			
		}//while 긑
		System.out.println(" 프로그램 종료 ");
		sc.close();
	}//main

}//class
