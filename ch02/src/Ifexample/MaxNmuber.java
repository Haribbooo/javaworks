package Ifexample;

public class MaxNmuber {

	public static void main(String[] args) {
		// 두 수중 큰 값을 찾는 프로그램
		// n1,n2 , max - 변수
		int n1 = 10;
		int n2 = 20;
		int 최대값; //한글이름 선언
		
		// 연산 1. if else 구문
		
		if(n1 >= n2 ) { // n1 > n2 || n1==n2 랑 같은것
			최대값 = n1;
		}else { // n1 < n2
			최대값 = n2;
		}
		
		// 연산 2. 조건 연산자
		int max = (n1 >= n2) ? n1 : n2;
		
		//출력
		System.out.println("두 수중 큰 값은" + 최대값 +"입니다.");
		System.out.println("두 수중 큰 값은" + max +"입니다.");
	}
	
}


