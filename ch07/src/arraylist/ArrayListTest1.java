package arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String [] carts = new String [4];
		//carts[0] = "사과"
		//String [] carts = new String []{"한라봉", "콩나물", "우유", "수박"};
		
		//리스트 공간이 기본 10개 생성 but 3개만 써도 3개 사용 할수있음 
		//배열과 똑같은 순서가 있음 (인덱싱이 된다) 0번째부터 
		ArrayList<String> carts = new ArrayList<>();
		
		//자료추가 -add() 
		carts.add("apple");
		carts.add("bean");
		carts.add("apple"); //중복 허용 
		carts.add("coffee");
		
		//자료출력 - get 
		System.out.println(carts.get(0));
		System.out.println(carts.get(1));
		System.out.println(carts.get(2));
		
		//리스트의 크기 
		System.out.println("리스트의 크기 :" +carts.size());
		
		//자료수정 - set()
		carts.set(2, "banana");
		
		//자료 삭제 - remove () 
		carts.remove(2); //2 번 인덱스 banana 삭제 
		carts.remove("coffee"); // carts 어레이리스트에서 coffee 삭제  객체이름을 넣어서!
		
		//리스트의 크기 
		System.out.println("리스트의 크기 :" +carts.size());
		
		//전체 출력
		for(int i = 0 ; i < carts.size(); i++) {
			String cart = carts.get(i); //저장된 자료를 가져와서 cart에 저장함 
			System.out.println(cart+",");
		}
		System.out.println("---향상된 for ---");
		
		//향상된 for문 for( 자료형 변수 : 리스트 이름())
		for(String cart : carts)
			System.out.println(cart);
	}
	

}
