package classes.methods;

import classes.Calculator; //다른 패키지에 있으면 불러와야됨

public class UseCalculator {

	public static void main(String[] args) {
		// 정수형 Calculator 객체를 생성
		Calculator calc = new Calculator();
		int num1 = 10, num2 = 2;
		
		int addVal= calc.add(num1, num2);
		int subVal= calc.sub(num1, num2);
		int mulVal= calc.mul(num1, num2);
		int divVal= calc.div(num1, num2);
		
		System.out.println(calc); //객체의 메모리 주소
		
		System.out.println("두수의 합 :" +addVal);
		System.out.println("두수의 차:" + subVal);
		System.out.println("두수의 곱:" + mulVal);
		System.out.println("두수의 나눔:" + divVal);
	}

}
