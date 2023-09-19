package interfaceex.remocon;

public class Television implements RemoteControl{
	
	//필드
	private int volume;
	

	@Override
	public void turnOn() {
		System.out.println("tv를 켰어");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 껐어");
		
	}

	@Override
	public void setVolume(int volume) {
		//volume :0~10 가능
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		this.volume = volume;
		System.out.println("현재 볼륨은: "+ this.volume);
		
	}
	
	

}
