package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
		String orginfile = "C:/File/MSMS.jpg";
		String copyfile = "C:/File/MSMS3.jpg";
		long start ,end;
		
		//보조 스트림은 단독으로 쓸 수 없음
		//기반 스트림을 생성자의 매개변수로 사용하여 쓸 수 있음
		try {
			InputStream is = new FileInputStream(orginfile);
			OutputStream os = new FileOutputStream(copyfile);
			
			//보조 스트림 객체 생성
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			start = System.currentTimeMillis();
			
			int data;
			while((data = bis.read()) != -1) { //바이트 데이터 읽음
				bos.write(data);
				
			}
			bis.close();
			bos.close();
			
			end = System.currentTimeMillis();
			System.out.println("복사 소요 시간" + (end - start) + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
