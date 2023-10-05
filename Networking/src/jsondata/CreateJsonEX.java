package jsondata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEX {
	//JSON 객체 생성
	public static void main(String[] args) {
		//Json 객체 만들기 (생성)
		JSONObject member = new JSONObject();
		
		//속성 및 속성값 추가
		member.put("id", "sky123");
		member.put("name", "최은호");
		member.put("age", 29);
		
		///객체 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "010-8774-8432");
		tel.put("mobile", "011-8774-8432");
		member.put("tel", tel); //member 객체에 객체 추가
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C");
		skill.put("C++");
		member.put("skill", skill); //member 객체에 배열 추가 
		
		
		
		//문자열 출력
		String json = member.toString();
		System.out.println(json);
		
		//member 객체 출력
		//System.out.println(member);
		
		
		//파일에 쓰기
		try {
			Writer writer = new FileWriter("C:/File/member.json" , 
					Charset.forName("UTF-8"));
			writer.write(json); // json 데이터를 문자열로 쓰기
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
