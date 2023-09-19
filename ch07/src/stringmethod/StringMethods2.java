package stringmethod;

public class StringMethods2 {

	public static void main(String[] args) {
		//indexOf( )- 검색에 유용
		//문자열이 시작되는 인덱스를 리턴합니닷 
		String str = "Hello World Hello";
		
		int val = str.indexOf("He"); //앞에서 부터 찾음 
		System.out.println(val);
		
		int val2 = str.lastIndexOf("Hello");	
		System.out.println(val2); //12 번째 
		
		int val3 = str.indexOf("ok");
		System.out.println(val3); //찾는 문자가 없느면 -1로 리턴함 
		
		
		//조건문 만들기이이잇!
		String subject = "자바 프로그램";
		
		if(subject.indexOf("자바") != -1	) { //자바가 검색이 되면
			System.out.println("자바와 관련된 책이로군요!");
		}else {  // 인덱스가  -1 이면 
			System.out.println("자바와 관련된 책이 아니로군요.");		
		} 
	}
}
