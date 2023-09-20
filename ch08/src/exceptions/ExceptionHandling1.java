package exceptions;

public class ExceptionHandling1 {
	
	public static void printlength(String data) {
		int count = data.length();
		System.out.println("문자 수: " + count);
	}

	public static void main(String[] args) {
		System.out.println("Start Program\n");
		
		printlength("subway");
		printlength(null);					 //오류가 뜨는 부분
		
		System.out.println("End Program\n");
	}

}
