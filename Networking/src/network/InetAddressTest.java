package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {	
		//IP ( Internet Protocol)
		try {
			InetAddress local = InetAddress.getLocalHost(); //로컬 컴퓨터 IP 열기
			System.out.println("내컴퓨터 IP주소" + local.getHostAddress());	
			
			//서버 컴퓨터 
			//DMS ( Domain Name Service)숫자 주소 => 문자 이름 변경하는 서비스
			//InetAddress server = InetAddress.getByName("www.naver.com");
			//System.out.println("네이버 컴퓨터 IP주소" + server);
			
			InetAddress[] server = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : server) {
				System.out.println(remote);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
