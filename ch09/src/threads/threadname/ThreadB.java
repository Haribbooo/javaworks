package threads.threadname;

public class ThreadB extends Thread{
	
	
	public ThreadB() {
		this.setName("ThreadB");
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 2 ; i++) {
			System.out.println(getName()+ "가 출력한 내용"); //스레드
		}
	}

}
