package collection.list;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		List<String> vegeList = new Vector<>();
		
		// 자료 생성 
		vegeList.add("적상추");
		vegeList.add("양상추");
		vegeList.add("적상추");
		
		//객체 삭제 ( Remove() )
		if(vegeList.contains("적상추")){ // 만약 인덱스에 당근이 있으면 당근 삭제해죠! 명령어
			vegeList.remove("적상추");
		}
		
		//리스트 객체의 개수
		System.out.println("총 객체수:" + vegeList.size());
		
		//전체 자료 조회 (Read :get () )  
		for (String vege : vegeList) { // 리스트를 순환하면서 
			System.out.println(vege + " "); //출력함 
		}
	}

}
