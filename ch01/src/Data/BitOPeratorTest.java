package Data;

public class BitOPeratorTest {

	public static void main(String[] args) {
		//비트 논리 연산자
		int num1 = 5;  //00000101	
		int num2 = 10; //00001010
					   //00000000
					   //00001111 = 15
							 
		int result;
		
		result = num1 & num2;
		System.out.println(result); //0
		
		result = num1 |num2; // 15
		System.out.println(result);
		
		//비트 이동 연산자
		// a << 2 - 변수 a를 2비트 만큼 왼쪽으로 이동
		// a >> 2 - 변수 a를 2비트 만큼 오른쪽으로 이동 
		int a = 10; // 00001010
		System.out.println(a << 2); //00101000-> 40
		System.out.println(a >> 2); //00000010-> 2
		
	}

}
