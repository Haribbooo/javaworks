package network.socket2;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestSever {
	
	private static ServerSocket serverSocket;

	public static void main(String[] args) {
		
		
		
		System.out.println("============================");
		System.out.println("");
		System.out.println("============================");
		
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q"));
			break;
		}
		
		scanner.close();
		stopServer();
	}
	
	private static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(8001);
					System.out.println("서버 시작.");
					
					while(true) {
						System.out.println("\n서버 연결 요청을 기다림 \n");
						Socket socket = serverSocket.accept();
						
						InetSocketAddress  isa = 
								(InetSocketAddress)socket.getRemoteSocketAddress();
						String clientIp = isa.getHostName();
						System.out.println("서버" + clientIp + "연결 요청 수락함");
						
						InputStream is = socket.getInputStream();
						byte [] bytes = new byte[1024];
						int readBytes = is.read(bytes);
						
						String message = new String (bytes, 0, readBytes,"utf-8");
						
						OutputStream os = socket.getOutputStream();
						bytes = message.getBytes("utf-8");
						os.write(bytes);
						os.flush();
						System.out.println("서버 받은 데이트를 다시보냄" + message);
						
						socket.close();
						System.out.println("서버 "+ clientIp+"의 연결을 끊음");
					}
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("서버"+ e.toString());
				}
			}
		};
		thread.start();
	}
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("서버 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
