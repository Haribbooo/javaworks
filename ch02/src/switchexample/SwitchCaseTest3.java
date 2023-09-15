package switchexample;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		// 사칙연산 - 산술 기호
		// 변수 - num1 num2 / operator , result
		// 2 * 3 = 6 
		
		int num1 = 2;
		int num2 = 10;
		char operator = '-';  // 값을 초기화 해서 
		int result = 0;
		
		//if ~ else 문///////////////////////////////////////////////
		if(operator=='+') {
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("지원 되지 않는 기능입니다.");
			return; //즉시종료
		}	
		System.out.println("결과 값은 "+ result +" 입니다." );
		
		 //switch case 문//////////////////////////////////////////
		switch(operator){
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("지원 되지 않는 기능입니다.");
			return; // 즉시종료
		}
		System.out.println("결과 값은 "+ result +" 입니다." );
		
		
		
	}//main 끝

}//class 끝
