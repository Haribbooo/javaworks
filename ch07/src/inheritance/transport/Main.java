package inheritance.transport;

public class Main {

	public static void main(String[] args) {
		//Person 객체생성
		Person sohee = new Person("소희", 10000);
		Person dohee = new Person("김도희",20000);
		
		//Bus 객체 생성
		Bus bus100 = new Bus("bus 100");
		
		//taxi 객체 생성
		KakaoTaxi taxi = new KakaoTaxi("카카오택시");
		
		sohee.take(bus100, 1500);
		dohee.take(bus100, 1500);

		sohee.showPersonInfo();
		dohee.showPersonInfo();
		bus100.showInfo();
		
		System.out.println("========taxi======");
		sohee.take(taxi, 4000);
		dohee.take(taxi, 4000);
		
		sohee.showPersonInfo();
		dohee.showPersonInfo();
		taxi.showInfo();
	}

}
