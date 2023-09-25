package threads.sychornizeTest;

public class SycronizedTest {

	public static void main(String[] args) {
		//공유 객체 새성
		Calculator calculator = new Calculator();
		
		//Suer1Theard  객체 생성
		User1Thread user1Thread  = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();	
		
		//Suer2Theard  객체 생성
		User2Thread user2Thread  = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();	
		
		
		
	}

}
