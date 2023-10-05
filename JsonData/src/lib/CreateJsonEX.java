package lib;

import org.json.JSONObject;

public class CreateJsonEX {

	public static void main(String[] args) {
		//Json 객체 만들기 (생성)
		JSONObject member = new JSONObject();
		
		//속성 및 속성값 추가
		member.put("id", "sky123");
		member.put("name", "최은호");
		
		//문자열 출력
		String json = member.toString();
		System.out.println(json);
		
		
	}

}
