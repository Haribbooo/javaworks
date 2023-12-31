package reference.subjects;

public class StudentName {

	public static void main(String[] args) {
		
		/*
		Student std1 =new Student(101,"최은호");
		Student std2 =new Student(102,"김희린");
		
		//과목 추가
		std1.koreanSubject("국어", 98);
		std1.mathSubject("수학", 100);
		std2.koreanSubject("국어", 97);
		std2.mathSubject("수학", 99);
		//학생 정보 출력
		std1.showStudentInfo();
		System.out.println("========================");
		std2.showStudentInfo();*/
		
		//객체 배열 사용
		//객체 생성
		Student[] students = {
			new Student(101,"최은호"),
			new Student(102,"김희린"),
			new Student(103,"함소연")
		};
		//점수 저장
		students[0].koreanSubject("국어", 98);
		students[0].mathSubject("수학", 80);
		students[0].showStudentInfo();
		System.out.println("");
		students[1].koreanSubject("국어", 90);
		students[1].mathSubject("수학", 70);
		students[1].showStudentInfo();
		System.out.println("");
		students[2].koreanSubject("국어", 89);
		students[2].mathSubject("수학", 83);
		students[2].showStudentInfo();
		
		//전체 출력
		for(int i =0; i< students.length;i++) {
			students[i].showStudentInfo();
		}
		//향상 for문 
		for(Student stu: students) { //참조전 클래스 이름 아무거나 : 배열)
			stu.showStudentInfo();
		}
	}

}
