package overriding.shop;

public class Shop1 extends HeadShop{
	
	public Shop1() {
		System.out.println("역세권 매장");
	}
	
	// 마우스 오른쪽클릭 소스메뉴에 오버라이딩 클릭해서 가져올거 선택하면됨

	@Override 
	public void 뼈해장국() {
		System.out.println("뼈해장국:8,500원");
	}

	@Override
	public void 짬뽕() {
		System.out.println("짬뽕:7,500원");
	}

	@Override
	public void 양념게장() {
		System.out.println("양념게장:10,500원");
	}
	
}
