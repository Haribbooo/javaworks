package chat.continueexam;

public class ContinueTest2 {

	public static void main(String[] args) {
		//1.일반 for = 1~10 까지 자연수중 홀수만 출력
		for(int i =1 ; i < 10; i++) {
			if(i % 2 !=0) {
				System.out.print(i);
			}
			
		}
		
		//2. continue를 사용하여 1~10까지 자연수중 홀수만 출력
		for(int i = 1; i < 10;i++) {
			if(i % 2 == 0) 
				continue; 
				System.out.print(i);			
			}
		
	}

}
