package methods;

public class MathTest {

	public static void main(String[] args) {
		// 내장 함수 - 수학(Math)
		int v1 = Math.abs(-10); //절대값 ( 거리) : 양수--> 양수, 음수 -->양수
		System.out.println("v1 :"+ v1);
		
		long v2 = Math.round(5.67); // 6 : 반올림 해서 정수로 반환
		System.out.println("v2 :" + v2);
		
		double v3 = Math.floor(3.31); // 소수점 아래 버리고 정수로 변환 3.0
		System.out.println("v3 :" + v3);
		
		//random.() - 무작위  0.0 <= rand <= 1.0
		double rand = Math.random();
		System.out.println("rand : " + rand );
		
		//Dice - 주사위 1~6 까지 
		int dice = (int)(Math.random()*6) + 1; // 0.9 * 6 = 반올림해서 5
		System.out.println("dice :" + dice);
		
		//1~10까지 무작위로 
		int number = (int)(Math.random()*10 + 1);
		System.out.println("number: " + number);
		
		
	}//main

}//class
