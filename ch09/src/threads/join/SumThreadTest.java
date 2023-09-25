package threads.join;

public class SumThreadTest {
	
	public static void main(String[] args) {
		//SumThread 객체 생성 
		SumThread sumThread = new SumThread();
		
		//main 스레드가 sum스레드를 호출하고 정지 상태로 돌아감 
		sumThread.start();
		
		try { 
			sumThread.join(); //참여하면서 run () 을 실행
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//메인 스레드가 최종 계산형 결과값을 산출하고 종료하면 다시..
		//메인 스래드는 결과값을 받아 호출함
		System.out.println(sumThread.getSum());
	}

}
