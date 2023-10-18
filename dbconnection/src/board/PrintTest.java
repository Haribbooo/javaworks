package board;

public class PrintTest {

	public static void main(String[] args) {
		//접수
		System.out.printf("%d\n",80); //80
		System.out.printf("%7d\n",85); //     85( 7자리 빈자리는 공백처리)
		System.out.printf("%-7d\n",85); //85( 7자리 빈자리는 공백처리,왼쪽정렬)
		
		
		
		//문자열
		System.out.printf("%s\n" ,"hellow");//hellow
		System.out.printf("%7s\n" ,"hellow"); //  hellow(7자리 빈자리는 공백처리)
		System.out.printf("%-7s\n" ,"hellow"); //hellow(7자리 빈자리는 공백처리,왼쪽정렬)
		
		
	}

}
