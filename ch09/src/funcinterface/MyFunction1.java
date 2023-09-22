package funcinterface;

//함수형 인터페이스사용 이유 - 클래스 만들지 않고 익명함수를 사용
//함수형 인터페이스에서는 추상메서드를 1개밖에 만들지 못한다.
@FunctionalInterface
public interface MyFunction1 {
	public void method();
	
	//public void method2();
}
