package thissamples;

public class ThisTest {
	//생성된 인스턴스 - dDay와 클래스의 this 속성과 주소 같음
	public static void main(String[] args) {
		Birthday bDay = new Birthday();		
		bDay.setyear(2023);
		
		System.out.println(bDay);		
		bDay.printThis();		         
	}

}
