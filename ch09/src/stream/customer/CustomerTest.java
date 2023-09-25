package stream.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {
		//고객을 저장할 자료 구조 - ArraryList : coustomerList
		List<Customer> customerList = new ArrayList<> ();
		
		//고객 객체 생성
		Customer choi = new Customer("최은호", 19, 100);
		Customer son = new Customer("손흥민", 32, 6000);
		Customer ro = new Customer("호날두", 34, 1090);
		
		//자료 저장
		customerList.add(choi);
		customerList.add(son);
		customerList.add(ro);
		
		System.out.println("=== 고객 명단 출력 ===");
		
		/*		 
		for ( Customer customer : customerList )
			System.out.println(customer.getName());
			*/
		
		//Stream 람다식 사용
		Stream<Customer> stream = customerList.stream();
		stream.map(c -> c.getName())
		                 .forEach(s-> System.out.println(s));
		
		
		//여행 비용
		int total = customerList.stream()
								.mapToInt(c->c.getPrice())
								.sum();
		System.out.println("비용은: " + total+"만원 입니다.");
		
		System.out.println("==== 나이가 20세 이상인 고객 명단 정렬하여 출력====");
		//중간 연산 - filter() ,  map () , sorted()
		//최종 연산 - forEach () 
		customerList.stream()
					.filter(c -> c.getAge() >= 20)
					.map(c -> c.getName())
					.sorted()
					.forEach(s -> System.out.print(s));
	}

}
