package collection.set;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		
		//hashSet 자료구조의 인스턴스 생성
		Set<Student> set = new HashSet<>();
		
		Student std1 = new Student("으노초이",101);
		Student std2 = new Student("최은호입니다.",102);
		Student std3 = new Student("홍길동.",103);
		Student std4 = new Student("최은호입니다.",102);
		
		//자료 저장 (추가
		set.add(std1);
		set.add(std2);
		set.add(std3);
		set.add(std4);
		
		//자료출력( 자료를 출력하면 리스트 형태로 출력)
		System.out.println(set);
	}
	

}
