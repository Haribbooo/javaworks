package objectequals.member;

public class MemberTest {

	public static void main(String[] args) {
		
		Member member1 = new Member("m1001","EunHo");
		Member member2 = new Member("m1001","EunHo");
		
		//논리적으로 동등객체를 확인할 hashCode() 재정의 
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		
		//문자열 일치하도록 equals() 재정의
		System.out.println(member1.equals(member2)); //false로 나옴 형변환해서 true 나옴
		
		//객체정보출력
		System.out.println(member1); //이것만 쓰면 주소가 나와서 멤버 클래스에 tostring override 해서 재정의
		System.out.println(member2);
	}

}
