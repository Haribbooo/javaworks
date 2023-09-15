package singleton.student;

public class Student {
	//필드
	private static int serialNum= 20220000;
	private int stuNum;
	
	public Student() {
		serialNum++;
		stuNum = serialNum;
		
	}
	
	public int getStuNum() {
		return stuNum;
	}

}
