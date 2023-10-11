package udpnetwork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {

	public static void main(String[] args) {
		
		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			System.out.println("[클라이언트] 통신 소켓 생성");
			
			//데이터 보내기 ( 송신 ) - 구독하고 싶은 뉴스 주제 보내기
			//서버의 호스트의 port를  명시해서 연결 요청함
			String data = "경제";
			byte[] bytes = data.getBytes("utf-8");
			DatagramPacket sendPacket = new DatagramPacket(bytes,
											bytes.length,
											new InetSocketAddress("localhost",8100));
			datagramSocket.send(sendPacket);
			
			//뉴스 받기 - 문자열로 복원
			//무한반복 대기
			while(true) {
				//서버가 보낸 뉴스  받기
				DatagramPacket receivePacket = new DatagramPacket
						(new byte[1024],1024);
				
				datagramSocket.receive(receivePacket);
				
				//문자열로 복원		
				String news = new String(receivePacket.getData(),
										0,
										receivePacket.getLength(),
										"utf-8");
				System.out.println(news);
				
				if(news.contains("뉴스10"))break;
						
			}//while 끝
			datagramSocket.close();
			System.out.println("[클라이언트] 통신 연결 끊음");
		}catch (IOException e) {
			System.out.println("[서버]"+ e.getMessage());
			//e.printStackTrace();
		}
	
	}

}