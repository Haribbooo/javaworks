package threads.sychornizeTest;

public class User2Thread extends Thread{
	
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
		
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator  = calculator;
	}
	
	//run 재정의 
	@Override
	public void run() { 
		calculator.setMemory(100);
	}
}
