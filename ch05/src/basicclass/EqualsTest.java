package basicclass;

public class EqualsTest {

	public static void main(String[] args) {
		//String name = "구씨";			// 스택영역
		String name1 = new String("구씨"); //팀 메모리
		String name2 = new String("구씨");
		
		//객체(인스턴스)의 메모리 주소 비교 10진수로 되어있음
		System.out.println(System.identityHashCode(name1));
		
		System.out.println(System.identityHashCode(name2));
	
		System.out.println(name1 != name2); //주소가 다르다 
		System.out.println(name1.equals(name1) == name2.equals(name2)); // 문자열은 같다 
		
		System.out.println("================================================================");
		
		Book book1 = new Book(100,"개미");
		Book book2 = new Book(100,"개미");
		
		System.out.println(book1 == book2); //주소가 다르다
		System.out.println(book1.equals(book2)); // false 가 나옴 so, 재정의가 필요하다
		
		// book 인스턴스의 물리적인 주소
		System.out.println(System.identityHashCode(book1));
		System.out.println(System.identityHashCode(book2));
		
		// 논리적 주소 일치 시킬 - hashCode() : object 클래스가 제공
	}

}
