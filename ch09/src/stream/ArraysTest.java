package stream;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {
	
	//main실수로 안넣었을 때 main 치고 + ctrl + spacebar 
	public static void main(String[] args) {
		//Arrays 클래스 - 배열을 수비고 효율적으로 처리하는 기능
		Integer[] num1 = {3,1,2,4,5}; 
		//int [] num1 = {3,1,2,4,5 };  좀더 큰 자료형  int > Iteger
		
		
		System.out.println(num1); // 주소가 나옴 
		System.out.println(Arrays.toString(num1));
		
		/*향상 for 문 = 값이 나옴
		for(Integer num : num1)
			System.out.println(num);*/
		
		
		
		//오름차순 정렬 - Arrays.sort( ) 
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		
		//오름차순으로 정렬된 배열을 뒤집기 =  Collection. reverse 사용 
		Collections.reverse(Arrays.asList(num1));
		System.out.println(Arrays.toString(num1));
		
		//num1의 요소 등 3개 복사 // Arrays.copyOf
		Integer [] num2 = Arrays.copyOf(num1, 3); //num1 요소를 3개 복사 
		System.out.println(Arrays.toString(num2));
						
		
	
		
		
	}

}
