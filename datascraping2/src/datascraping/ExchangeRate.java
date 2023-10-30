package datascraping;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ExchangeRate {

	public static void main(String[] args) {
		
		//접속 페이지의 데이터 가져오기
		try {
			//환률 정보를 가져올 웹 페이지 url 
			String url = "https://finance.naver.com/marketindex/";
			
			//Connection 객체 생성
			Connection conn = Jsoup.connect(url);	
			
			Document doc = conn.get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
