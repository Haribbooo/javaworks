package thissamples;

public class Birthday {
	//3개의 필드
	int day;
	int month;
	int year;
	
	public void setyear(int year){
		this.year =year;
	}
	
	//this를 리턴하는 메서드 정의
	public void printThis() {
		System.out.println(this);
	}
}
