package classes.methods;

public class UseHello {

	public static void main(String[] args) {
		// Hellow클래스 사용
		Hello say =new Hello();
		say.sayHello();  //호출
		say.sayHello("Jason");
		say.sayHello(" 은호");
	}

}
