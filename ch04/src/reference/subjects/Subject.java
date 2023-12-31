package reference.subjects;

//Subject 자료 정의
public class Subject {
	//필드
	private String subjectName; // 과목 이름
	private int scorePoint;   // 과목점수
	
	//기본생성자 생략	
	public Subject() {}			
	
	//get set 만들기	
	//과목 이름 입력
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	//과목 이름 출력
	public String getSubjectName() {
		return subjectName;
	}
	// 점수 입력
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	//점수 출력
	public int getScorePoint() {
		return scorePoint;
	}
}
