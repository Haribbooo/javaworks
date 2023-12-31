package classes.Constructor;

public class PersonTest {

	public static void main(String[] args) {
		// person 객체 생성 사용
		//개본 생성자(constructor) 로 생성
		Person p1 = new Person();
		p1.name ="은호";
		p1.height =184;
		p1.weight = 80.6F;
		p1.showPersonInfo();
		
		System.out.println("--------------");
		
		Person p2 = new Person("손흥민 ");
		p2.height =187.4F;
		p2.weight = 76.7F;
		p2.showPersonInfo();
		
		System.out.println("--------------");
		Person p3 = new Person("류현진", 189.5F , 90.1F);
		p3.showPersonInfo();
	}

}
