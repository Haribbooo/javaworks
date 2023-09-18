package abstracts.shop;

public  class Shop1 extends Headshop{
	
	public Shop1() {
		System.out.println("====대학가 매장입니다====");
	}
	@Override
	public void 된장찌개() {
		System.out.println("된장찌개 : 8000원");
	}
	@Override
	public void 돼지국밥() {
		System.out.println("돼지국밥: 7000원");		
	}
	@Override
	public void 뼈해장국() {
		System.out.println("뼈해장국 : 9000원");
		
	}

}
