package abstracts.template;

public class CarTest {

	public static void main(String[] args) {
		//추상클래스는 객체 생성 안됨				
		//Car car = new Car();
		//추상클래스 타입으로 객체 생성
		Car hisCar = new ManualCar();
		hisCar.run();
		
		Car myCar = new AiCar();
		myCar.run();
	}

}
