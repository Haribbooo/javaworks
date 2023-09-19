package interfaceex.remocon;

public interface RemoteControl {
	//인터페이스 상수
	public int MAX_VOLUME = 10;
	
	public int MIN_VOLUME = 10;
	
	
	
	//추상메서드
	public void turnOn();
	
	public void turnOff();
	
	public void setVolume(int volume);
	
	//정적메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	//일반(구체화된) 메서드 default 키워드를 붙임 
	default void setMute(boolean mute) {
		if(mute) { //mute = true
			System.out.println("무음");
		}else {
			System.out.println("무음해제");
		}
	}
}
