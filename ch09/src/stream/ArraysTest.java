package stream;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {
	
	//main실수로 안넣었을 때 main 치고 + ctrl + spacebar 
	public static void main(String[] args) {
		Integer[] num1 = {3,1,2,4,5};
		
		//오름차순 정렬 - Arrays.sort( ) 
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		
		//오름차순으로 정렬된 배열을 뒤집기 ..
		Collections.reverse(Arrays.asList(num1));
		System.out.println(Arrays.toString(num1));
		
		//num1의 요소 등 3개 복사 // Arrays.copyOf
		Integer [] num2 = Arrays.copyOf(num1, 3); //num1 요소를 3개 복사 
		System.out.println(Arrays.toString(num2));
						
		//Arrays.toString() - 객체 그대로 (리스트형 )_ 출형
		System.out.println(Arrays.toString(num1));
		
				
		
		
		
		
		
		
		
		
		
		
	}

}
