package classes.Constructor;

public class NumberSample {

	int x; // 변수 - 멤버 변수
	public NumberSample() {
		x = 4;
	}
	//매개변수 있는거
	public NumberSample(int y) {
		x =y;
		
	}
	public static void main(String[] args) {
		NumberSample myNum =new NumberSample();
		System.out.println(myNum.x);
		
		System.out.println("==============");
		
		
		NumberSample myNum2 = new NumberSample(10);
		System.out.println(myNum2.x);
	}
}
