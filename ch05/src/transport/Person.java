package transport;


//자료형
public class Person {
	//필드 
	String name; //이름
	int money; // 가진돈
	
	public Person(String name, int money) {
		this.name= name;
		this.money= money;
	}
	
	//버스를 탄다       //class객체가 들어감
	public void takeBus(Bus bus) {
		bus.take(1500);
		this.money-= 1500; // 가지고 있는 돈에서 버스 요금1500원 만큼 차감
	}
	//지하철을 탄다 
		public void takeSubway(Subway subway) {
			subway.take(1360);
			this.money -=1360;
		}
		
	
	
	
	//사람의 정보
	public void showPersonInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원입니다\n", name, money);

	}
}
