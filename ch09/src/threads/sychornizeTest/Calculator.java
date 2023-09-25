package threads.sychornizeTest;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	//sychornize 키워드를 붙이면 lock을 걸어서
	//처음 스레드에 의해서 변경되지 않음 
	
	public void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//현재 스레드 이름 
		System.out.println(Thread.currentThread().getName() 
							+ ":" + this.memory);
	}
}
