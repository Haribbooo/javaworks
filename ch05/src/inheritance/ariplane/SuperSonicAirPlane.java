package inheritance.ariplane;

public class SuperSonicAirPlane extends AirPlane{
	
	//1.일반 비행 2. 초음속 비행
	
	static final int NORMAL =1;
	static final int SUPERSONIC =2;
	
	int flyMode = NORMAL;
	
	@Override //매서드 재정의 상속받고 다시 매서드를 재정의 
	public void 비행() {
		if(flyMode ==SUPERSONIC) {
			System.out.println("초음속 비행중..!");
		}else {
			super.비행(); //상속 받은 부모 메서드 사용(super.사용)
		}
	}
	
}
