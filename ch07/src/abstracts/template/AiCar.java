package abstracts.template;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("차량이 자율주행합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("차가 스스로 멈춥니다..");
		
	}

}
