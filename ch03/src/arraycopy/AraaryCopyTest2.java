package arraycopy;

public class AraaryCopyTest2 {

	public static void main(String[] args) {
		// 배열 복사하기 - 문자형
		char[] arr1 = { 'N' , 'E' , 'T'};
		
		//arr3인 배열 선언		
		char[] arr2 = new char[3];
		
		// 복사 - 저장 
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] =arr1[i];
		}
		
		//arr2 출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println("  ");
		
		/* arr3[2] = arr2[0];  N
		 * arr3[1] = arr2[1]; E
		 * arr3[0] = arr2[2];  T
		 */
		
		//역순 복사 - T E N 
		char[] arr3 = new char[3];
		
		for(int i = 0; i < arr2.length; i++) {
			arr3[2-i] = arr2[i];
		}
		
		//arr3 출력
		for(int i = 0 ; i < arr3.length; i++) {
			System.out.print(arr3[i]+ " ");
		}
		
		
		
	}

}
