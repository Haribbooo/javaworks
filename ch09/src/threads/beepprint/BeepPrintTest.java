package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args)  {
		//싱글 스레드 - 메인 스레드만 실행
		// "띵" 문자를 5번 출력 
		//1초 간격으로 - 대기 시간 넣기  -
		for( int i = 1; i <=5 ; i++) {
			System.out.println("띠딩..");
			try {
				Thread.sleep(500); // 예외 처리 해야됩 				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
						
	}
		//띵 소리를 5번 재생하기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i <=5 ;i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

}
}
