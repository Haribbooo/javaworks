package funcinterface.lamdaint;

public class MyNumber2Test {

	public static void main(String[] args) {
		MyNumber2 myNum;
		
		//getMax() 구현 - 람다식으로
		/*
		myNum =(x ,y) -> {
			return (x >= y) ? x : y;
		};*/
		
		//간단 방식으로   return 생략 가능
		myNum = (x,y) -> (x >= y) ? x : y;
		
		//getMax 호출 
		myNum.getMax(10, 20);
		System.out.println("큰수 는 :" + myNum.getMax(10, 20));
	}

}
