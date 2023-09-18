package objectequals.member;

public class Member {
	private String memberId;  // 사번
	private String name;  // 이름
	
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}
	
	//hashCode() 재정의
	@Override
	public int hashCode() { //멤버이름.hashCode ()를 반환
		return memberId.hashCode();
	}
	//equal() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member =(Member)obj; //강제 형변환 
			if(this.memberId.equals(member.memberId) &&
				this.name.equals(memberId)) {
				return true; // 외부 입력된 회원아이디와 이미 생성된 회원아이디 일치하면
			}
		}
		return false;
	}
	
	//객체 문자열 정보  - toString () 재정의 
	@Override
	public String toString() {
		return memberId + " ," + name;
	}
	
	

}
