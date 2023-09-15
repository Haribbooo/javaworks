package Ifexample;

public class LimitSpeedTest {

	public static void main(String[] args) {
		// 
		
		
		
		
		
		
		
		
		
		
		
		
		int limitSpeed =45;
		
		
		
		//if ~ else 구문
		if(limitSpeed>=50) { //50 보다 크거나 같다
			System.out.println("제한속도위반! 과태료 10만원부과대상!");
		}else{ // (50보다 작다)생략 조건문이 들어가면 if가 들어간다.
			System.out.println("안전 속도 준수!");
		}
		System.out.println("시속"+limitSpeed+"km입니다.");

	}

}
