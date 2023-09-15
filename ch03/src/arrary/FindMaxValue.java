package arrary;

public class FindMaxValue {

	public static void main(String[] args) {
		//배열에서 최대값 찾기
		//1. 최대값 설정(maxVal) - 0번 인덱스로 시작해서 차례대로 비교
		//2. 전체를 반복하면서 최대값 과 비교해서 
		//    최대값 보다 크면 그 값을 최대값으로 변경
		int[] arr = new int[] {1, 5, 8, 3, 2};
		int maxVal =arr[0];
		
		for(int i =1; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
			/*
			 *  i = 0		maxVA
			 *  i = 1  5 > 1  
			 *  i = 1  5 > 1
			 *  i = 1  5 > 1
			 *  i = 2
			 *  i = 3
			 *  i = 4
			 */
		
		}
		//최대값 출력
		System.out.println("최대값:" + maxVal);

	}//main

}//class
