package Wrapper;

public class IntegerTest {

	public static void main(String[] args) {

		//int num1 = 100;
		Integer num1 = 100; 
		int num2 = 200;
		
		int sum = num1.intValue()+ num2; // num1 은 객체라서 메서드에 접근 가능  num2는 ㄴㄴ
		
				
		System.out.println(num1);
		System.out.println(sum);
		
		//value() --> 정수나 문자열을 숫자로 변환   value of **
		Integer num3 = Integer.valueOf(123);
		System.out.println(num3);
		
		//parseInt() --> 문자열을 숫자로 변환
		int num4 = Integer.parseInt("456");
		System.out.println(num4);
	}

}
