package whileexample;

public class WhileEx3 {

	public static void main(String[] args) {
		// 1~ 10 까지 출력
		// 반복 조건문 사용 (while ~ if ~ break)
		// 변수 - i 
		int i = 0;
		
		while(true) {
			i++; // i = i + 1
			if(i > 10)
				break;
			System.out.print(i); //1, 2, 3, 4, 5....
			//if(i == 10)
				//break;           위치에 따라 부호 or 값이 다르게 해야한다.
		}
		
	}

}
