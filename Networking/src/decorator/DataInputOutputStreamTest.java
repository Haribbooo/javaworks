package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputStreamTest {

	public static void main(String[] args) {
		// 정수 ,실수 ,문자열 쓰기
		
		try {
			//기반 스트림 객체 생성
			OutputStream os = new FileOutputStream("./data.db");
			//보조 스트림 객체 생성 , 혼자 쓸 수 없다. 기본스트림에 연결해야됌
			DataOutputStream dos = new DataOutputStream(os);
			
			//기본 타입 자료 쓰기
			dos.writeInt(100);
			dos.writeUTF("최은호");
			dos.writeDouble(95.4); //실수형 데이터 
			
			dos.writeInt(90);
			dos.writeUTF("김희린");
			dos.writeDouble(98.4); //실수형 데이터 
			
			dos.flush();
			dos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//바이트 데이터 읽기
		try(InputStream is = new FileInputStream("./data.db");
			DataInputStream dis = new DataInputStream(is)) {
				//기본 타입 자료 읽기
			
		//파일에 쓴 순서대로 읽기
		for(int i = 0; i<2 ; i++) {
				int num = dis.readInt();
				String name = dis.readUTF();
				double score = dis.readDouble();
				System.out.println(num + " : " + name + " : "+ score);
		}
				}catch(IOException e) {
					e.printStackTrace();
				}
		}

}
