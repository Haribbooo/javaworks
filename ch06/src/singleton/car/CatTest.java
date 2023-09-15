package singleton.car;

public class CatTest {

	public static void main(String[] args) {
		//싱글톤이기 때문에 객체가 한개임
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourMoney = factory.createCar();
		
		System.out.println("신차번호:" +mySonata.getCarNum());
		System.out.println("신차번호 :"+yourMoney.getCarNum());

	}

}
