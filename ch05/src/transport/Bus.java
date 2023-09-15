package transport;

public class Bus {
	//필드
	int busNumber; // 몇번 버스
	int passenger; // 승객
	int money; // 수입
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	//승객을 태운다
	public void take(int fee) { //요금 받음
		this.money += fee; // 요금을 더해서 수입이 추가됨
		passenger++;  //승객수 1명 증가
	}
	//버스의 정보
	public void showBusInfo() {
		System.out.printf("%d번 버스수입은 %,d원이고 승객수는 %d명입니다\n",
							busNumber,money,passenger);					
		
	}
}
