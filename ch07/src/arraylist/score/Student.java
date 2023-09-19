package arraylist.score;

import java.util.ArrayList;

public class Student {
	
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList; //배열
	
	public Student(int studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	//과목 추가 Create
	 public void addSubject(String name, int score) {
		 Subject subject = new Subject(name, score);
		 subjectList.add(subject); //어레이 리스트의 저장함(0번부터)
	 }
	 //학생으 ㅣ정보 출력
	 public void showStudentInfo() {
		 int total = 0; // 총점을 알고싶다...
		 double avg;
		 for(int i = 0; i < subjectList.size(); i++) {
			Subject s = subjectList.get(i);
			total += s.getScorePoint();
			System.out.printf("학생 %s의 %s과목의 점수는 %d점.\n"
								,studentName, s.getSubjectName()
								,s.getScorePoint());
		 }
		 avg =(double)( total / subjectList.size());
		 System.out.printf("%s의 Total Score은 %d점이고 평균은 %.2f점", 
				 			studentName, total,avg);
		
	 }

}
