package inheritance.statment;

public class Drink {
	// protected 접근제어자는 상속할때만 사용한
	protected String name; // 상품
	protected int price; //가격
	protected int count; //수량
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price= price;
		this.count =count;
	}
	
	public int getTotalPrice() {
		// 금액은 가격 * 수량
		return price * count;
	}
	
	public static void printTitle() { //제목행
		 System.out.println("상품명\t가격\t수량\t금액");		//static 
	}
	
	public void printData() {
		System.out.println(name+"\t"+ price + "\t"+ count+ "\t"
							+ getTotalPrice());
	}
}
