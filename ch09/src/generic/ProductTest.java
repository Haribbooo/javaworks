package generic;

public class ProductTest {

	public static void main(String[] args) {
		//Product 객체 생성
		Product < TV , String> prod1 = new Product<>();
		Product < Car , String> prod2 = new Product<>();
		
		//TV 인스턴스 생성
		TV tv = new TV();
		Car car = new Car();
		
		prod1.setKind(tv);
		prod1.setModel("Model 3");
		
		prod2.setKind(car);
		prod2.setModel("전기차");
		
		tv.making();
		System.out.println("Model Name: " + prod1.getModel());
		
		System.out.println("             -----              ");
		
		car.making();
		System.out.println("모델명:" + prod2.getModel());
		//자동차를 생성해서 모델명을 출력
	}

}
