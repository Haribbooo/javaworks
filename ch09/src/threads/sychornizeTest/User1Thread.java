package threads.sychornizeTest;

public class User1Thread extends Thread{
	
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread"); // 스레드 이름 생성 ( 설정 )
		
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator  = calculator;
	}
	
	//run 재정의 
	@Override
	public void run() { 
		calculator.setMemory(50);
	}
}
