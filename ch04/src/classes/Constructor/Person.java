package classes.Constructor;

//참조자료형 - Person 클래스정의
// 생성자 오버로딩 - 이름이 같고 자료형이 다름
public class Person {
	String name;
	float height;
	float weight; 
	
	
	
	//기본생성자
	public Person() {}
	
	//매개변수가 있는 생성자
	public Person(String n) {
		name = n;
	}
	//매개변수가 있는 생성자(ㅁ또는 필드)
	public Person(String n, float h,float w) {
		name = n; // 외부에서 입력된 이름을 저장
		height = h; // 외부에서 입력한 키
		weight=w; //외부에서 입력한 몸무게
		
	}
	
	//매서드
	public void showPersonInfo() {
		System.out.printf("이름: %s , 키:%f , 몸무게:%f",
				name,height,weight);			
	}
}
