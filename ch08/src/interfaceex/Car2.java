package interfaceex;

public class Car2 {
	//필드를 배열로 서언
	Tire [] tires = {
			new HanTire(),
			new HanTire(),
			new KumTire(),
			new KumTire(),
	};
	
	//메서드
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
