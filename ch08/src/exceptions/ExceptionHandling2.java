package exceptions;

public class ExceptionHandling2 {
		//예외처리
		
		public static void printlength(String data) {
			//예외처리(실행 예외 - 런타임 오류)
			try {
				int count = data.length();
				System.out.println("문자 수: " + count);
			}catch(NullPointerException e){
				//에러처리 구문
				System.out.println(e.getMessage());
				e.printStackTrace(); //경로를 추적해가면서 에러를 출력
			}	
		}
	public static void main(String[] args) {
		System.out.println("Start Program\n");
		
		printlength("subway");
		printlength(null);					 //오류가 뜨는 부분
		
		System.out.println("End Program\n");
	}

}
