package arraycopy;

public class FindMaxIdx {

	public static void main(String[] args) {
		// 최대값의 위치 찾기
		//최대값의 위치 0 번으로 ㅓㄹ정
		int[] arr = new int [] { 10, 100, 600 ,700 ,300, 80000,90000};
		int maxIdx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[maxIdx]) // 값의 대소 비교
				maxIdx = i; // 최대값 위치에 i를 저장
			}
		System.out.println("최대값의 위치: " + maxIdx);
		}
		
		

	}


