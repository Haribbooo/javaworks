package whileexample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		// 점수에 따른 학점 출력 프로그램
		// 변수 score 정수형 , grade 문자형
		// a - 90~100
		// b - 80~90
		// c - 70~80
		// d - 60~70
		// f - 0~60
		
		
		//객채변수 scan 생성
		Scanner scan = new Scanner(System.in);
		
		
		
		//입력
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt(); // 사용자 입력을 받는것 
		char grade = 'A'; //char 형은 한 문자이기 때문에 ' '(홀 따음표) 를 쓴다 
		
		
		//연산 
		if(score >= 90 && score <= 100) { //true && true
			grade = 'A';
		}else if(score >= 80 && score < 90) {
			grade = 'B';
		}else if(score >= 70 && score < 80) {
			grade = 'C';
		}else if(score >= 60 && score < 70) {
			grade = 'D';
		}else  { //else if(score >= 0 && score < 60) 이거임 가능하면 줄여서 
			grade = 'F';
		}
		//출력
		System.out.println(grade + " 학점 입니다.");
		scan.close();
	}

}
