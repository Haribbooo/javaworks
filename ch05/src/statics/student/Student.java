package statics.student;


public class Student {
	//필드 생성
	static int serialNum=1000;
	int id; //인스턴스 변수(필드)
	String name; //인스턴스 변수(필드)
	
	/*
	public Student() {
		serialNum++;
		id =serialNum;
	}*/
	//입력
	public void setId(int id) {
		this.id =id;
	}
	//출력	
	public int getId() {
		return id;
	}
}
