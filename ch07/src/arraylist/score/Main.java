package arraylist.score;

public class Main {

	public static void main(String[] args) {
		// Student 객체 생성
		Student std1 = new Student(201401234,"훈이");
		
		std1.addSubject("국어", 90);
		std1.addSubject("수학", 100);
		std1.addSubject("체육", 82);
		
		
		std1.showStudentInfo();

	}

}
