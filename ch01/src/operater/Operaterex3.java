package operater;

public class Operaterex3 {

	public static void main(String[] args) {
		//예제3. - 홀수 짝수 판별하는 프로그램
		//어떤수를 2로 나눠서 나머지가 0이면 짝수 1이면 홀수
		//결과값이 '짝수입니다." 또는 "홀수입니다."
		int number = 11;
		
		String str = (number % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println("판정 : " + str );
		
		
	}

}
