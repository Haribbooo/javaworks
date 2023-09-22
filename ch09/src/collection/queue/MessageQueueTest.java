package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {

	public static void main(String[] args) {
		//Queue를 구현한 LinkedList를 자료구조로 사용 
		Queue<Message> msgQueue =new LinkedList<>();
		
		//Message 객체 생성  - offer 
		Message email = new Message("email","최은호");
		Message sns = new Message("sns","eunho");
		Message katalk = new Message("katalk","choi");
		
		
		//객체 저장 -offer()
		msgQueue.offer(email);
		msgQueue.offer(sns);
		msgQueue.offer(katalk);
		
		//객체 꺼내기 (삭제 ) - poll()
		//반복 - 확인( IsEmpty () )
		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll(); //1개씩 꺼내기
			switch(message.command) {
			case "email":
				System.out.println(message.to + "님이 이메일을 보냈습니다");
				break;
			case "sns":
				System.out.println(message.to + "님이 sns을 보냈습니다");
				break;
			case "katalk":
				System.out.println(message.to + "님이 카톡을 보냈습니다");
				break;
			}
			}
			
		}
	}


