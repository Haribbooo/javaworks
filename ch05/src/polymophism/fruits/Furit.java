package polymophism.fruits;

public class Furit {
	//필드
	protected String name;
	protected String weight;
	protected int price;
	
	public Furit() {}
	
	public void showFruitInfo(){
		System.out.println("과일이름:" + name);
		System.out.println("과일 무게:"+ weight);
		System.out.println("과일 가격:"+ price);
		
	}

}
