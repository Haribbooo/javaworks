package operater;

public class OperaterEx5 {

	public static void main(String[] args) {
		// 논리연산자
		// &&-엠퍼샌드 : 두 항이 모두 참인경우에만 결과값이 참, 하나라도 거짓이면 거짓이다 -논리곱
		// ||-bar 2개 : 두 항 중 하나만 참이여도 참(true)-논리합
		// ! - 항이 참이면 거짓이고 거짓이면 참임 - 논리 부정
		System.out.println((4 < 5) && (10 ==11)); //false
		System.out.println((4 < 5) || (10 ==11)); //true
		System.out.println(10 == 11); //true부정형

	}

}
