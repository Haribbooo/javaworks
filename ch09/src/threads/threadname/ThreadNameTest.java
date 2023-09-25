package threads.threadname;

public class ThreadNameTest {

	public static void main(String[] args) {

		
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름" + mainThread.getName());
		
		//이름을 정해주지 않으면 0 부터
		Thread threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : "+ threadA.getName());
		threadA.run();
		
		Thread threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : "+ threadB.getName());
		threadB.run();
		
		
	}

}
