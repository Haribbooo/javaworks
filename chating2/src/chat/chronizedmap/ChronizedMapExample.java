package chat.chronizedmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChronizedMapExample {
	

	public static void main(String[] args) {
		// 동기화된 컬렉션 - 멀티 스레드
		Map<Integer,String> map = 
				Collections.synchronizedMap(new HashMap<>());
		//Map<Integer,String> map =  new HashMap<>(); // 싱글 스레드
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i<=1000; i++) {
					map.put(i, "내용"+ i);
				}
			}
		};			
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i = 1001; i<=2000; i++) {
					map.put(i, "내용"+i);
				}
			}
		};		
			threadA.start();
			threadB.start();
			
			try {
				threadA.join(); //run() 을 실행
				threadB.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("총 객체 수 :" + map.size());
			
			// map 에 저장된 전체 출력 향상 for 문 
			Set<Integer> keys = map.keySet();
			for(Integer key : keys)
				System.out.println(key+ " , " + map.get(key));
		}
	}

