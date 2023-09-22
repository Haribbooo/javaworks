package collection.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		//QUeue - 선입선출 (FIfO)	
		List<String> myList = new LinkedList<>();
		
		//자료 추가 
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//객체 출력
		System.out.println(myList); //리스트형식으로 출력
		
		
		//특정위치에 자료 출력
		myList.add(2,"D");
		System.out.println(myList);
		
		//전체 출력
		for(String list :myList) {
			System.out.print(list+" ");
		}
	}

}
