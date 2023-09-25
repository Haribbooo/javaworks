package stream.customer;

public class Customer {
	//필드
	private String name; //이름
	private int age;  //나이 
	private int price; //여행비용

	//생성자
	public Customer(String name, int age , int price) {
		this.name =name;
		this.age = age;
		this.price = price;
	}
	
	//get 만 해도 됨 위에 set 했음 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}	
}
