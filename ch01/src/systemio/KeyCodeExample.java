package systemio;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		System.out.print("한 개의 문자를 입력하세요 ");
		keyCode = System.in.read();  //문자 입력
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();  //문자 입력
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();  //문자 입력
		System.out.println("keyCode: " + keyCode);
	}
}
