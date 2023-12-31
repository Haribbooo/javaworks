package interfaceex.sorting;

import java.io.IOException;

public class SotrTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택하세요");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		
		Sort sort =null;
		if(ch == 'B' || ch =='b'	) { 
			sort = new BubbleSort();
		}else if(ch == 'L' || ch =='l'	) {
			sort = new HeapSort();
		}else if(ch == 'T' || ch =='t'	) {
			sort = new QuickSort();
		}else{
			System.out.println("지원 안되는 기능");
			return;
			
		}		
		int [ ]arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
		
	}

}
