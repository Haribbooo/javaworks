package reference.subject2;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(101,"최은호");
		
		
		
		
		kim.addSubject("국어", 100);
		kim.addSubject("수학", 59);
		kim.addSubject("과학", 79);
		kim.showStudentInfo();
		

	}

}
