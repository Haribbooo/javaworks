package constant;

public class ConstantQuest {

	public static void main(String[] args) {
		// 상수 선언 및 사용
		//int maxNum = 100;
		final int MAX_NUM= 100;
		//MAX_NUM = 1000; // 상수는 변경 못함
		
		System.out.println(MAX_NUM);
		
		//원의 넓이 구하기 반지름 * 반지름 * 원주율
		//변수 - 반지름(radius), 넓이(circleArea)
		//상수 - PI , 상수는 변경할 수 없음
		
		int radius = 5;
		final double PI= 3.14;
		double circleArea;
		
		circleArea = radius * radius * PI;
		System.out.println("원의 넓이는" + circleArea);
		
	}

}
