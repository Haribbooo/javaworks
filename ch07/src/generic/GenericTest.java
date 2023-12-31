package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		// Generic(일반화) 이전의 코드 작성
		ArrayList cartlist = new ArrayList();
		
		cartlist.add("beef");
		cartlist.add("coffee");
		
			//강제형변환 다운캐스팅 필요함 
		String item = (String) cartlist.get(0);
		System.out.println(item);
	
		
		//Generic 을 이용한 코드 작성 java 1.5버전 이후 
		ArrayList<String> list = new ArrayList<>();
		list.add("beef");
		list.add("coffee");
		
		String item2 = list.get(0);
		System.out.println(item2);

	}

}
