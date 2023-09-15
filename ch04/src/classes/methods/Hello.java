package classes.methods;

public class Hello {
	//기본생성자
	//public Hello(){} 생략된 부분임 없어도 된다
	
	
	//sayHello() 매서드 정의
	//메서드 오버로딩 (함수 이름은 같고 매개변수가다름)
	public void sayHello() {
		System.out.println("watup");
	}
	
	public void sayHello(String name) {
		System.out.println("Hey"+ name);
	}
}
