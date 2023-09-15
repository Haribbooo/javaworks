package singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		
		School school = School.getInstance();
		
		Student stu1 = school.creatStudent();
		Student stu2 = school.creatStudent();
		
		System.out.println("최은호" + stu1.getStuNum());
		System.out.println("김희린:" + stu2.getStuNum());

	}

}
