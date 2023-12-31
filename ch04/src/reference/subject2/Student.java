package reference.subject2;

import reference.subjects.Subject;

public class Student {
	
	private int studentId; //int studentId=0
	private String studentName; //String studentName=null
	private Subject[] subjects;
	
	public Student(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
		subjects =new Subject[10]; //과복 배열을 10개 생성		
	}
	
	//과목을 추가하는 메서드를 생성
	public void addSubject(String name, int score) {
		//과목 객체를 생성해서 값을 저장
		Subject subject = new Subject();		
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		//과목을 배열에 저장 
		//subjects[0] = subject; //1개 저장
		for(int i =0; i<subjects.length;i++) {
			if(subjects[i] == null) { //배열의 요소가 비어있을때
			subjects[i] = subject; //비어있는 것만 배열 객체를 저장
			break; // 그리고 빠져나와야됨 계속 반복되면 안됌
			}
		}
	}
	//학생 정보를 출력
	public void showStudentInfo() {
		int total = 0; //총점
		int count=0; // 평균을 나눠줄 null이 아닌 개수  변수 설정
		double avg; // 평균
		
		for(int i =0 ; i< subjects.length; i++) {
			
			if(subjects[i] != null) { //배열의 요소가 비어있지 않을 때
				Subject subject =subjects[i];//객체 생성하고 출력
				count++;//들어갈때마다 개수 추가됨				
				total += subject.getScorePoint();
			
			System.out.println(studentId+"번 학생 " + studentName +
					"의 "+ subject.getSubjectName()+"  점수는 "
					+ subject.getScorePoint()+"점 입니다.");
			}
		}
		avg =(double) total/ count;//평균 = 총점 /개수
		System.out.printf("총점은 %d점, 평균은 %.1f 입니다.\n",total,avg);
	}

}















