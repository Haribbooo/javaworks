package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		//List에 객체 생성해서 저장함 
		List<String> list =Arrays.asList("LG","SAMSUNG","LOTTE");
		/*
		List<String> list = new ArrayList<>();
		list.add("LG");
		list.add("SAMSUNG");
		list.add("APPLE");*/
		
		//comStream 생성 후 한번만 사용되고 -다시사용하려면 재생성 필요
		Stream<String> comstream = list.stream(); //list의 모든 객체를 가져옴 
		comstream.forEach(com ->System.out.println(com));//람다식 출력
		
		//for () ,forEach() - 객체를 각각 출력
		
		
	}

}
