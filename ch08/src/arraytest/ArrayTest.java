package arraytest;

public class ArrayTest {
	
	public static int add(int [] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4};
		//add() 호출할때 매개변수로 배열을 전달
		int result = add(numbers);
		System.out.println(add(numbers));
		
	}

}
