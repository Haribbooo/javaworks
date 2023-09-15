package typinggame;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 영어 단어가 랜덤하게 화면에 출력 
		//맞으면 통과 틀리면 ㅄ ㅋㅋ 
		//10문제 수행
		//시간 측정 currenttime  
		
		String[] words = {"ant", "bear","chichken","duck","elephant","frog","glodbug","horse","monkey","Tiger"};
		
		Scanner sc = new Scanner(System.in);
		int n = 1; // 문제 번호 
		double start, end;
		System.out.println("===========================");
		System.out.println("===영어타자 게임 준비되면 엔터===");
		System.out.println("===========================");
		sc.nextLine(); // 엔터누르는거
		
		start = System.currentTimeMillis(); // 게임 시작할때 
		while(n <11) {  //  n이 11일때 빠져나옴
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제"+n+"번");
			String question = words[rand];
			System.out.println(question); // 단어 출제 
			//단어 입력
			String answer = sc.nextLine(); // 사용자 입력
			
			if(question.equals(answer)) {
				System.out.println("pass");
				n++; // 문제가 맞으면 다음 문제로 넘어감 
			}else {
				System.out.println("qt zz");
			}
		}
		end = System.currentTimeMillis();
		System.out.printf("걸린시간 %.2f 초입니다.\n",(end-start)/1000 );
			
		
		
		
		sc.close();
		
	}

}
