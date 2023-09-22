package collection.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashMap {
	//HashMap 자료구조 객체 생성
	private Map<Integer,Member> hashMap;
	
	public MemberHashMap() {
		hashMap  = new HashMap<>();
	}	
	
	//회원 추가
	public void addMember(Member member) {
		//key - memberId  vaule - member 객체
		hashMap.put( member.getMemberId(),member);
		
	}
	
	//회원목록 조회
	public void showAllMember() {
		//인덱싱 안됨 (순서 X ) -  반복자Iterator  사용 , keySet - 키 집합
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {// 객체 수단을 반복 
			int key = ir.next(); //키를 가져옴 
			Member member = hashMap.get(key); //키를 객체로 멤버 객체 가져옴 
			System.out.println(member);
		}
		
	}
	//회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { //객체가 존재한다면
			hashMap.remove(memberId);//해당 객체를 삭제함
			return true;			
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	//회원의 전체 수 
	public int getSize() {
		return hashMap.size();
	}
}
