package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		// 중첩 for 문 
		// 5행 5열에 * 을 출력
		
		for(int i =1; i<=5;i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			 System.out.println();
		}
			 	System.out.println();
		
		for(int i=1; i<=5; i+=1) {
			for(int j =1; j<=6-i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
				System.out.println();
		
		for(int i =1; i<=5;i++) {
			for(int j =5; j>=i; j--) {
				System.out.print("*");
				//System.out.println(" i =" + i +"j=" + j); 로그 확인
			}
			 	System.out.println();
		}
	} //main

}//class
