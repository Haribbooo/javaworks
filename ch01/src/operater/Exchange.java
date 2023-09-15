package operater;

public class Exchange {

	public static void main(String[] args) {
		// 변수의 값을 교환
		// 변수를 선언 = 입력
		int x = 0;
		int y = 1;
		int temp;  //임시 변수 선언
		
		//출력
		System.out.println("****교환전****");
		System.out.println("x=" + x + ", y= "+ y);
		
		
		//교환처리(연산) 
		temp = x;   // temp에는 0(x 값)이 들어감
		x = y;      // x에는  1(y 값) 이 들어감
		y= temp;    // y는 temp에 있는 0(x 값)이 들어감
		
		System.out.println(); // 줄 띄어쓰기
		
		//출력
		System.out.println("****교환 후****");
		System.out.println("x=" + x + ", y= "+ y);
		

	}

}
