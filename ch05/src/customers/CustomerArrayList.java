package customers;

import java.util.ArrayList;

public class CustomerArrayList {

	public static void main(String[] args) {
		//일반 고객 2명 , 골드 2명 , vip 1명 
		//Customer [] customers = new Customer[5];
		ArrayList<Customer> customerList = new ArrayList<>();
		
		/*
		//고객 객체 생성 - 부모 타입으로 생성(다형성) 
		Customer lee = new Customer(10010,"이재용");
		Customer shin = new Customer(10020,"신재용");
		Customer hong = new GoldCustomer(10030,"홍준표");
		Customer youl = new GoldCustomer(10040,"율곡이이");
		Customer king = new VIPCustomer(10050,"킹콩",1004);
		
		//고객list 객체 저장 add() 
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(king);*/
		
		//리스트의 add의 매개변수로 직접 객체 생성 후 저장 
		customerList.add(new Customer(10010,"이재용"));
		customerList.add( new Customer(10020,"신재용"));
		customerList.add(new GoldCustomer(10030,"홍준표"));
		customerList.add(new GoldCustomer(10040,"율곡이이"));
		customerList.add(new VIPCustomer(10050,"킹콩",1004));
		
		
		//상품 구매 
		int price = 10000;
		
	
		
		//고객 정보 출력
		for(int i = 0; i< customerList.size();i++) {
			Customer customer = customerList.get(i);
			//보너스 적립금 계산
			int cost = customer.calcPrice(5000);
			System.out.printf("%s님이 지불할 비용은 %d 원 입니다."
								,customer.customerName , cost);
			System.out.println(customer.showCustomerInfo());
		}
		
	}

}
