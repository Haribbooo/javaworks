package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		
		MemberHashMap memberMap = new MemberHashMap();
		
		//회원 추가
		memberMap.addMember(new Member(1001,"이순신"));
		memberMap.addMember(new Member(1002,"김 구"));
		memberMap.addMember(new Member(1003,"나석주"));
		//회원 추가
		//memberMap.addMember(new Member(1004,"최은호"));
		
		System.out.println("총 객체 수 :"  + memberMap.getSize());
		//회원 삭제
		memberMap.removeMember(1003);
		memberMap.removeMember(1004);
		
		System.out.println("총 객체 수 :"  + memberMap.getSize());
		
		//회원 목록
		memberMap.showAllMember();
	}

}
