package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		//String 자료형으로 데이터 관리 ( CRUD )
		List<String> vegeList = new ArrayList<>();
		
		//자료 생성 ( 추가 ) Create -add 사용
		vegeList.add("당근"); // 0번 인덱스에 저장
		vegeList.add("마늘"); // 1번 인덱스에 저장
		vegeList.add("고추"); // 2번 인덱스에 저장
		vegeList.add("마늘"); // 3번 인덱스에 저장
		
		//특정 자료 조회 Read - get 사용 
		System.out.println(vegeList.get(1));
		
		//리스트 객체 개수
		System.out.println("총 객체수: " + vegeList.size());
		
		//객체 수정 (Update : set () )
		vegeList.set(2, "감자"); //2번 인덱스 고추가 --> 감자로 바뀜 
		
		//객체 삭제 ( Remove() )
		if(vegeList.contains("당근"))
		// 만약 인덱스에 당근이 있으면 당근 삭제해죠! 명령어
		vegeList.remove("당근");
		
		System.out.println("총 객체수: " + vegeList.size()); //삭제후 객체수 
		
		
		//전체 자료 조회 (Read :get () )  
		for (int i = 0 ; i < vegeList.size(); i++) { // 리스트를 순환하면서 
			String veg = vegeList.get(i); //객체를 가져와서
			System.out.println(veg + " "); //출력함 
		}
	}

}
