package reference.subjects;

public class Student {
	//필드 
	int studentId; //학번
	String studentName; // 이름	
	Subject korean; //국어 과목(참조)
	Subject math;	//수학 과목
	
	//매개변수가 있는 생성자
	
	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		korean =new Subject(); //korean객체 생성
		math = new Subject(); //math 객체 생성
	}
	//수학 과목
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//국어과목 추가 매서드(함수) 정의
	
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	//학생의 정보 출력
	public void showStudentInfo() {
		System.out.println(studentName +"의 "+korean.getSubjectName()+
							" 점수는 "+ korean.getScorePoint()+"점입니다.");
		System.out.println(studentName +"의 "+math.getSubjectName()+
				" 점수는 "+ math.getScorePoint()+"점입니다.");
	}
}
