package inheritance.ariplane;

public class Main {

	public static void main(String[] args) {
		SuperSonicAirPlane sa =new SuperSonicAirPlane();
		
		sa.이륙();
		sa.비행();
					// 스택틱 붙히면 클래스 명으로 접근
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC; //모드 변경
		sa.비행();
		
		sa.flyMode =SuperSonicAirPlane.NORMAL;
		sa.비행();
		
		sa.착륙();
		
		

	}

}
