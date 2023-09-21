package collection.set;

import java.util.HashMap;
import java.util.Map;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Map<String, Student> map = new HashMap<>();
		
		//학생 인스턴스 생성
		Student std1 = new Student("으노초이",101);
		Student std2 = new Student("최은호입니다.",102);
		Student std3 = new Student("홍길동.",103);
		Student std4 = new Student("최은호입니다.",102);
		
		//객체 저장 Map에 
		map.put("으노초이", std1);
		map.put("최은호입니다.", std2);
		map.put("홍길동", std3);
		map.put("최은호입니다.", std4);
		
		System.out.println(map);
	}

}
