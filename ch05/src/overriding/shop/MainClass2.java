package overriding.shop;

public class MainClass2 {

	public static void main(String[] args) {
		//자동형변환
		HeadShop shop1 = new Shop1(); //shop1의 생성자
		
		shop1.뼈해장국();
		
		System.out.println("==================");
		
		
		HeadShop shop2 =new Shop2();
		shop2.뼈해장국();
		
		
		int iNum =10;
		double dNum;
		
		dNum = iNum; //반대로 하면 강제형변환으로
		System.out.println(dNum); //10.0 이 나온다
		
		iNum = (int)dNum; //강제형	변환
	}

}
