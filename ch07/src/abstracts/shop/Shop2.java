package abstracts.shop;

public class Shop2 extends Headshop {
	
	
	public Shop2() {
		System.out.println("====역세권 매장입니다.====");
	}

	@Override
	public void 된장찌개() {
		System.out.println("된장찌개 : 9000원");
		
	}

	@Override
	public void 돼지국밥() {
		System.out.println("돼지국밥: 8000원");	
		
	}

	@Override
	public void 뼈해장국() {
		System.out.println("뼈해장국 : 10000원");
		
	}

}
