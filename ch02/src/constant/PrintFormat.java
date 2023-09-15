package constant;

public class PrintFormat {

	public static void main(String[] args) {
		//printf ("문자열 포맷 ", 객체)
		// 정수 -%d 실수-%f  문자-%s
		// int = decimal(10진수) 
		// 줄바꿈 문자 - 역 슬래쉬 t , 역슬래쉬 t
		int year = 2023;
		System.out.printf("올해는 %d년 입니다.\n", year);
		
		
		float weight = 80.8F;
		System.out.printf("몸무게는 %.2f kg 입니다.\n", weight);
		
		String nick = "으노";
		System.out.printf("은호의 별명은 %s \n", nick);
		
		//\t사용
		//int um = 0; 
		//num += 1;
		String table = "";
		table +="----------------------\n";
		table +="이름 \t나이\t 나라\n";
		table +="----------------------\n";
		table +="최은호\t 29\t 한국\n";
		table +="이기영\t 40\t 중국\n";
		table +="-----------------------\n";
		System.out.println(table);

	}

}
