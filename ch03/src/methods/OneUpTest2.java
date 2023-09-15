package methods;

public class OneUpTest2 {
	//정적 변수 - static 키워드를 붙힌 변수
	//정적 변수는 생선된 후 프로그램이 종료될 때 소멸함 
	// 특징은 값을 공유 , 누적한다.
	static int x = 1;  //전역 공간 ( 위쪽 공간 = Global Space)
	
	public static int oneUp() {
		x +=1;
		return x;
	}

	public static void main(String[] args) {
		System.out.println(oneUp()); //2
		System.out.println(oneUp()); //3
		System.out.println(oneUp()); //4
		
		//변수 x 의 값 
		System.out.println("x : " + x);// 최종값 4 
	}//main

}//class
