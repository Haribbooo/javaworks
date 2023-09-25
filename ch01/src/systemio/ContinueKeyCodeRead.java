package systemio;

import java.io.IOException;

public class ContinueKeyCodeRead {

	public static void main(String[] args) throws IOException {
		//'q' 입력하면 종료(코드값 : 113)
		int keyCode;
		
		System.out.println("여러개의 문자를 입력하세요 ");
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113)
				break;
		}
		System.out.println("종료");
	}

}
