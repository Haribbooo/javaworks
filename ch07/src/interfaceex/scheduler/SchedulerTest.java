package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		//인터페이스의 다양성을 구현 
		System.out.println("전화 상담 배분 방식을 선택하세요");
		System.out.println("R: 한명씩 차례로 배분");		
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 배분");		
		System.out.println("P: 우선 순위가 높은 고객에게 먼저 배분");
		
		// 한 문자 입력- char 인데 int를 사용함(코드값)
		int ch = System.in.read();
		
		Scheduler scheduler = null;
		if(ch == 'R' || ch =='r'	) { //int형이므로 동등비교(==) 연산자 사용
			scheduler = new RoundRobin();
		}else if(ch == 'L' || ch =='l'	) {
			scheduler = new LeastJob();
		}else if(ch == 'T' || ch =='t'	) {
			scheduler = new priorityAllocation();
		}else{
			System.out.println("지원 안되는 기능");
			//return;
			System.exit(0); //프로그램 즉시 종료
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	
		
	}

}
