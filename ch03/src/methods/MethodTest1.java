package methods;

public class MethodTest1 {
	
	// 함수 정의와 호출  <--> 변수의 선언과 사용  = 같은 의미		
	public static void main(String[] args) {
		sayHello(); // 호출
		sayHello("파이썬");
		sayHello("은호");
		//System.out.println("Hi");
	}	
	// sayHello() 이름의 함수를 정의
	// void - 반환값이 없음 (비어있다)
	public static void sayHello() {
		System.out.println("Hi , 자바");
	}
	//매개변수(parameter)가 있는 함수 정의 
	public static void sayHello(String name) {
		System.out.println("Hi , " + name );
	}//main 끝
}//class 끝 
