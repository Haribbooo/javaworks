package array2d;

public class Array2dTest1 {

	public static void main(String[] args) {
		// 정수형 2차원 배열// 	[]열의크기[] 행의 크기
		int[] [] arr =new int [2] [3];   // []열의 크기 [] 행의 크기  [2행 ] [3열] 
		System.out.println(arr.length);    //행의 길이 (가로)
		System.out.println(arr[0].length); // 1행의 1열의 크기 (세로) 
		System.out.println(arr[1].length); // 1행의 2열의 크기 
		
		//전체 출력 이중 for문을 써야된다 
		
		for(int i = 0; i <arr.length; i++) {
			for(int j=0; j<arr[i].length; j ++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		//배열의 값을 저장 
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		//선언과 동시에 초기화(인덱싱) 
		int [] []arr2 = {
				{1,2,3},    //2차원 배열 , 같은 크기의 배열을 넣을 필요는 없음 
				{4,5,6},
				{7, 8 }
		};
		
		//System.out.println(arr[1][0]);
		//전체 출력
		for(int i = 0; i <arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j ++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println("");
		}
	
		
		
	}

}
