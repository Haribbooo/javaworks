package arrary;

public class ArraryTest4 {

	public static void main(String[] args) {
		// 실수형 배열의 연산
		// 크기가 5인 실수형 배열 data 선언
		// total
		double[] data = new double[5];
		double total = 0;
		double avg;
		//저장
		data[0]	= 10.0;
		data[1]	= 20.0;
		data[2]	= 30.0;
		
		//조회 계산 
		for(int i =0; i < data.length; i++){
			System.out.println(data[i]);
			total += data[i];
			
		}
		avg = total / data.length;
		//총점 출력
		System.out.println("총점은"+ total);
		System.out.println("평균은"+ avg);
		
		
	}//main

}//class
