package inheritance.statment;

public class SaleStatment {

	public static void main(String[] args) {
		//Drink 클래스 사용
		Drink coffee = new Drink("커피", 4000, 10);
		Drink greentee= new Drink("녹차",3000,4);
		
		//Alcohol 클래스 사용
		Alcohol 참이슬 = new Alcohol("참이슬",5000,20, 17.5F);
		Alcohol 블랑 = new Alcohol("블랑",4500,10,9.4F); 
		//Drink 전표 출력
		Drink.printTitle();
		coffee.printData();
		greentee.printData();
		
		System.out.println("----------------------------------------");
		
		//Alcohol 전표 출력
		Alcohol.printTitle();
		참이슬.printData();
		블랑.printData();
		
		//총계 출력
		int sumVal = coffee.getTotalPrice()+ greentee.getTotalPrice()
					+참이슬.getTotalPrice()+블랑.getTotalPrice();
		System.out.println("==============합계:"+sumVal+"==============");
		
			
 
	}

}
