package collection.queue;

public class Message {
	
	//필드
	String command; // 수행  이메일 , sms , kaktalk
	String to; 		// 대상
	
	//생성자
	Message(String command, String to){
		this.command = command;
		this.to = to;
	}
}
