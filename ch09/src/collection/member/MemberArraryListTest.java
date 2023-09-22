package collection.member;

public class MemberArraryListTest {

	public static void main(String[] args) {
		//MemberArraryListTest 클래스의 객체 생성
		MemberArraryList memberList = new MemberArraryList();
		
		//Member 객체 생성
		Member mem1 = new Member(1001,"이순신");
		Member mem2 = new Member(1002,"김 구 ");
		Member mem3 = new Member(1003,"나석주");
		Member mem4 = new Member(1002,"김 구 ");
		
		//회원 추가 메서드 호출
		memberList.addMember(mem1);
		memberList.addMember(mem2);
		memberList.addMember(mem3);
		memberList.addMember(mem4);
		
		//회원삭제 
		memberList.removeMember(1002);
		memberList.removeMember(1004);//1004번 없는데 변환 없음 
		
		//총객체수
		System.out.println("총 객체수 :" + memberList.getSize());
		
		//회원 목록 조회
		
		

	}

}
