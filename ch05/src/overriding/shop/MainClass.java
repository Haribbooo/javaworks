package overriding.shop;

public class MainClass {

	public static void main(String[] args) {
		Shop1 shop1 = new Shop1();
		
		
		shop1.뼈해장국();
		shop1.짬뽕();
		shop1.양념게장();
		System.out.println("===============================");
		
		Shop2 shop2 = new Shop2();
		shop2.뼈해장국();
		shop2.짬뽕();
		shop2.양념게장();
		
		
	}
	

}
