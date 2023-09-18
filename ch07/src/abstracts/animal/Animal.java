package abstracts.animal;

public abstract class Animal {
	
	//필드
	public String kind; // 종류
	public void breathe() {
		System.out.println("숨을 쉽니다..후하후하");
	}
	//추상 메서드 (구현을 안함 , 상속받는 클래스는 필수로 구현해야함) 
	//예를 들면 cry는 안되고 sound () 만 사용하도록 강제 
	public abstract void sound(); 
}
