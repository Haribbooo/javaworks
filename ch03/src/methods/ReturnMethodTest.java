package methods;

public class ReturnMethodTest {
	
	//return 이 있는 함수 ( 반환 자료형) - int String
	// 반환 자료형은 호출한 값으로 반환값을 보내는 것
	public static void main(String[] args) {
		int n1= 10, n2 = 20; // local 변수 = 지역 변수
		//더하기 함수 호출
		
		int result = add(n1, n2);
		System.out.println(" Result : " + result);
		
		//제곱 수 호출
		
		int result2 = square(n1);
		System.out.println(" Result : " + result2);
		
		//메세지 호출
		String msg = message();
		System.out.println(msg);
		
	}//main
	
	//return 있고 , 매개변수가 2개인 함수 이름 - add()
	public static int add(int a, int b) { // a 와 b를 더하는 함수
		return a + b;
	}//add
	
	//return 있고, 매개변수 1개 인 함수 
	public static int square(int x) { //제곱 수를 구하는 함수
		return x * x;
	}//square
	
	//return 있고, 매개변수가 없는 함수
	public static String message() { //String 을 출력하는 함수
		String msg = " good luck " ;
		return msg;
	}

}//class
