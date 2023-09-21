package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapTest {

	public static void main(String[] args) {
		// 학생(객체 ) 의 이름과 점수를 저장할  HashMap 객체 생성
		Map<String , Integer> map = new HashMap<>();  // ctrl  + shift + o(영어) 누르면 import 한방에 됨 
		
		//객체 저장
		map.put("으노", 100); //key,value
		map.put("김덕배", 90);
		map.put("시환", 10);
		map.put("으노", 80); // 으노의 점수 100을 80 으로 후에 바꿈 
		
		//특정 객체 조회
		System.out.println(map.get("김덕배")); // key 값으로 점수 입력
		
		//객체 삭제
		if(map.containsKey("으노")) { //으노가 있으면..->
			map.remove("으노");  // 으노 삭제
		}
		
		//총 객체수
		System.out.println("총 객체수: " + map.size()); // 순서없음 
		
		//전체 조회
		Set<String> keySet = map.keySet(); 
		Iterator<String> ir = keySet.iterator(); // 인덱스 (순서가 없을대 ) Iterator 사용   key 값으로 반복적 객체 생성 
		while(ir.hasNext()) { // 객체 수단을 반복
			String key = ir.next(); // 자료가 있으면 1개씩 가져옴 		
			Integer value = map.get(key);
			System.out.println(key+ " = " + value);
		}
		//조회2 
		for(String key : keySet) {
			System.out.println(key ); //key 만나옴 
		}
		// 객체 자체를 출력 - (key = value) 
		System.out.println(map);
	}

}
