package customers;

public class CustomerTest2 {

	public static void main(String[] args) {
		// 부모형으로 객체 생셩: 자동형변환
		//매개변수 있는거라 set get ㄴㄴ
		Customer lee = new Customer(1001,"은호");
		
		int price = 1000;
		lee.calcPrice(price);
		int cost = lee.calcPrice(price);
		
		System.out.println(lee.getCustomerName() +"님이 지불한 비용은"
				+ cost +"원 입니다.");
		System.out.println(lee.showCustomerInfo());
		
		
		//부모형으로 객체 생성 - 자동 형변환
		
		Customer woo = new VIPCustomer(1001,"제발요..",9999);
		
		price  = 2000;
		cost = woo.calcPrice(price);
		System.out.println(woo.getCustomerName() +"님이 지불한비용은"
				+ cost +"원 입니다.");
		System.out.println(woo.showCustomerInfo());
		
		
	}

}
