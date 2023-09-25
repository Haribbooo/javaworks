package threads.beepprint;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		
		//beepTask 객체 생성   
		Runnable beepTask = new BeepTask();
		//작업 스레드 - 객체 생성
		Thread thread = new Thread(beepTask);
		thread.start(); //스레드  시작 
		
		for( int i = 1; i <=5 ; i++) {
			System.out.println("띠딩..");
			try {
				Thread.sleep(1000); // 예외 처리 해야됩 				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
