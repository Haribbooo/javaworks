package transport;

public class Main {

	public static void main(String[] args) {
		
		Person p1 =new Person("이말년", 10000); //p1(사람객체) 생성
		Person p2= new Person("이재용",999999);
		
		Bus bus6632 =new Bus(6632); //버스 생성
		Bus bus1001 =new Bus(1001);
		
		Subway green =new Subway("2호선");
		
		
		p1.takeBus(bus6632);
		p2.takeBus(bus6632);
		p1.takeBus(bus1001);
		p2.takeBus(bus1001);
		
		p1.takeSubway(green);
		
		//정보출력
		p1.showPersonInfo();
		p2.showPersonInfo();
		System.out.println("===================================");
		bus6632.showBusInfo();
		bus1001.showBusInfo();
		green.showSubwayInfo();

	}

}
