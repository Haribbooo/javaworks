package booktest;

public class Bus extends Car {
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	@Override
	public void refuel() {
		System.out.println("가스를 주유합니다");
	}
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	
}
