package collection.stack;

public class MyStackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		//객체 넣기
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		//객체 빼기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop()); //에러 처리나서 null처리 해야됌 
	}

}
