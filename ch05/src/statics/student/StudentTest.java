package statics.student;

public class StudentTest {

	public static void main(String[] args) {
		//인스턴스 객체 변수, 클래스 객체 변수(static)
		//클래스 변수는 클래스 이름으로 직접 접근해야된다(new하지 않는다)
		//값이 공유되고 , 누적되어 프로그램 종료되면 소멸함
		Student.serialNum++;
		System.out.println(Student.serialNum);
		
		Student.serialNum++;
		System.out.println(Student.serialNum);
		
		Student s1 = new Student();
		s1.setId(101);
		System.out.println("학번:"+ s1.getId());
		
		
		
	}

}
