package stream.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("은호",90),
				new Student("희린",80),
				new Student("소연",70)		
		);
		//학생의 이름과 점수 출력 
		Stream<Student> stdStream = list.stream();
		stdStream.forEach(std -> {
			//System.out.println(std.getName()+" :" + std.getScore());
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name+" : " + score);
		});
		
		// 학생의 이름만 출력 
		//Stream 객체는 한번만 사용 가능 
		//map () - 매개변수에 매핑(일치)하는 것을 구현할 때 사용되는 함수
		//학생 객체에 있는 이름만 출력함
		stdStream =list.stream();
		stdStream.map(std -> std.getName())
					.forEach(std -> System.out.println(std));
		
		//학생 점수에 해당되는 내용만 출력
		// 점수인 경우 - mapToInt ()  을 사용 
		stdStream = list.stream();
		stdStream.mapToInt(std -> std.getScore())
				 .forEach(n -> System.out.println(n));
		
		//점수가 90점 이상인 학생의 이름 출력
		//filler() 함수 - 조건의 일치되는 내용을 걸러냄때 사용함
		list.stream().filter(std ->std.getScore() >= 90)
					 .map(std -> std.getName())
					 .forEach(s -> System.out.println(s));
		
		
	}

}
