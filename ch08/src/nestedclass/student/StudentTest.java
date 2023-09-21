package nestedclass.student;

//중첩 클래스는 클래스간밀접한 관련이 있거나 ,
//다른 클래스의 협력할 일이 없는 경우에 사용됨
class Student{
	private String name; //private 해도 상관없다..
	
	public Student(String name) {
		this.name= name;		
	}
	//중첩 클래스 (내부 클래스)
	class Score{
		int eng;
		int math;
		
		void showInfo() {
			System.out.println("이름 : " + name );
			System.out.println("영어점수 : " + eng );
			System.out.println("수학점수 : " + math );
		}
	}
}
public class StudentTest {

	public static void main(String[] args) {
		//외부클래스의 객체 (인스턴스) 생성
		Student choi = new Student("최은호");
		
		//내부 클래스의 인스턴스 생성\
		// 외부클래스.내부클래스 인스턴스  = 내부 인스턴스.new 내부클래스();
		Student.Score score = choi.new Score();
		
		score.eng = 88;
		score.math =78;
		score.showInfo();
		
	}

}
