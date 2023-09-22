package funcinterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		//Calculator 변수 선언 -add 
		Calculator add;
		int num1 = 10 , num2 =5;
		
		//Calculator ( )를 구현 - 람다식
		
		
		
		//덧셈
		add = (x,y)-> (x+y);				
		//호출
		System.out.println("합 :" + add.calculate(num1, num2));		
		//뺄셈 구현
		add = (x,y)-> (x-y);
		//호출
		System.out.println("빼기 :" + add.calculate(num1, num2));
		//곱셉구현
		add = (x,y)-> (x*y);
		//호출
		System.out.println("곱 :" + add.calculate(num1, num2));
		//나눗셈구현
		add = (x,y)-> (x/y);
		//호출
		System.out.println("나누기 :" + add.calculate(num1, num2));
		
		
		
		//Calculate( ) 호출 
		
		
	}

}
