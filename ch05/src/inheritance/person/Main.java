package inheritance.person;

public class Main {

	public static void main(String[] args) {
		
		//choi 가 Person클래스를 사용할 수 있음
		Engineer choi = new Engineer("으노",29,1234);
		choi.name="으노";
		choi.age=29;
		choi.cpId= 1234;
		
		System.out.println("이름:"+choi.name+
							" 나이:"+choi.age+ 
							" 번호:"+choi.cpId);
		
	}

}
