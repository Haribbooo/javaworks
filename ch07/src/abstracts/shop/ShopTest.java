package abstracts.shop;

public class ShopTest {

	public static void main(String[] args) {
		
		//추상클래스는 객체 생성이 안돼용~
		Headshop shop1 = new Shop1();
		shop1.된장찌개();
		shop1.돼지국밥();
		shop1.뼈해장국();
		
		Headshop shop2 = new Shop2();
		shop2.된장찌개();
		shop2.돼지국밥();
		shop2.뼈해장국();
		

	}	

}
