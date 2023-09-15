package inheritance.statment;

public class Alcohol extends Drink {
	
	float alcper; //알콜 도수

	public Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count); //부모는 super.
		this.alcper= alcper; // 자기는 this.
	}
	
	public static void printTitle() {
		System.out.println("상품명(도수%)\t가격\t수량\t금액");
	}
			// Drink의 private는 
	@Override // private이면 접근이 안되서 접근제어자(protected)사용해서 접근한다
	public void printData() {
		System.out.println(name+" "+"("+alcper+")"+"\t"+ price + "\t"+ count+ "\t"
				+ getTotalPrice());
	}

}
