package overriding.shop;

public class Shop2 extends HeadShop{
	
	public Shop2() {
		System.out.println("대학가 매장");
	}
	@Override
	public void 뼈해장국() {
		System.out.println("뼈해장국:6,500원");
	}

	@Override
	public void 짬뽕() {
		System.out.println("짬뽕:6,500원");
	}

	@Override
	public void 양념게장() {
		System.out.println("양념게장:9,500원");
	}
	

}
