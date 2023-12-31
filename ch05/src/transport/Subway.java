package transport;

public class Subway {
	//필드
	String lineNumber ; //지하철번호
	int passenger; //승객
	int money; //수입
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int fee) { //요금 받음
		this.money += fee; // 요금을 더해서 수입이 추가됨
		passenger++;  //승객수 1명 증가
	}
	//지하철의 정보
	public void showSubwayInfo() {
		System.out.printf("%s 지하철 수입은 %,d원 승객수는 %d명입니다 \n"
							,lineNumber ,money,  passenger);
				
	}
}
