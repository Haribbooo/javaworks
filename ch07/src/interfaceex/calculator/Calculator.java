package interfaceex.calculator;

//구성요소 - 상수 , 추상 메서드
//필드나 생성자가 없음
//interface는 모든 메서드가 추상메서드이다.
public interface Calculator {
	
	// 인터페이스 상수 //final 사용하지 않아도 된다
	//변수를 선언해도 오류가 나지 않는 이유는 상수로 변환됨
	int ERROR = -99999; 
	
	//추상메서드
	int add (int num1 , int num2);
	int sub (int num1 , int num2);
	int mul (int num1 , int num2);
	int div (int num1 , int num2);
	
	

}
