package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// LocalDateTime 사용
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//날 짜 /시 간 / 오전
		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss a");
		System.out.println(now.format(dtFormat));
		
		//날짜 만 설정
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//시간
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
		//날 짜 /시 간 /  오전
		DateTimeFormatter timeFormat =DateTimeFormatter.ofPattern("HH:mm:ss a");
		System.out.println(now.format(timeFormat));
		
		
		//특정 날짜 지정하기
		LocalDate startDay = LocalDate.of(2023, 8, 1);
		LocalDate today = LocalDate.of(2023, 9, 15);
		
		//지나온 날짜 계산하기
		long passedTime = ChronoUnit.DAYS.between(startDay,today);
		System.out.println(passedTime+"일 지나므");
		
		
	}
	

}
