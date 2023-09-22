package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {
	
	public static void main(String[] args) {
		//문자열 배열
		String [ ] 과일 = {"사과","배","수박","참외"};
		
		//for문 사용 x -> forEach 사용 -> stream 객체 얻어옴
		//Stream<String> strStream = Arrays.stream(과일);
		//strStream.forEach(str -> System.out.println(str));
		Arrays.stream(과일).forEach(str -> System.out.println(str));
		
		//정수형 배열 
		int[] number = {1 ,2, 3, 4};
		//Stream<Integer> numStream = Arrays.stream(number);
		//numStream.forEach(n -> System.out.println(n));
		Arrays.stream(number).forEach(n -> System.out.println(n));
		
		//합계  ,개수 ,평균구하기
		//sum 쓰려면 int 
		int sumVal = Arrays.stream(number).sum(); 
		//count ()의 함수형의 long이므로 int로 다운 캐스팅 
		
		int count = (int) Arrays.stream(number).count();
		double avg = (double)sumVal /count ;
		
		System.out.println("합계 :" + sumVal);
		System.out.println("개수 :" + count);
		System.out.println("평균 :" + avg);
	}

}
