package serialization;

import java.io.Serializable;
//Member 클래스를 직렬화 하기
//직렬화- 현 상태를 그래돌 저장하거나 
//연속스트림 ((월ㄷ
public class Member implements Serializable{

	private static final long serialVersionUID = 1001L;
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+ " ," +name;
	}

}
