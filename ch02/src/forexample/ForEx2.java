package forexample;

public class ForEx2 {

	public static void main(String[] args) {
		//1~ 10까지 더하기
		//변수 - i , total 
		int i =1; //반복 변수
		int total = 0; // 합계
		
		for(i = 1; i <= 10; i++) {
			total +=i; //total = total + 1
			System.out.print("i="+i+",total="+total);
			
		}
		System.out.println("합계" + total );
		/*
		  1 = 0 + 1
		  3 = 1 + 2
		  6 = 3 + 3
		  ....
		 */
	}

}
