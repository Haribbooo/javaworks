package methods;

public class MathTest2 {

	public static void main(String[] args) {
		// 주사위 10번 던지기 
		
		for(int i = 1; i <=10; i++) {
			int dice =(int)(Math.random()*6 +1);
			System.out.print(dice);
		}
		
		// 배열에서 문자열을 랜덤하게 추출
		String[] word = {"나" ,"너" ,"우리", "나라"};
		
		int idx = (int)(Math.random()*word.length);
		
		System.out.print(word[idx]);
		
		//전체 출력
		for(int i= 0; i< word.length; i ++) {
			System.out.println(word[i]);
		}
		//랜덤 추출
		/*int idx = (int)(Math.random()*word.length);
		System.out.println(word[idx]);*/
		
	}//main

}//class
