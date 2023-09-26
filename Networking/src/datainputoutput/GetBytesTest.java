package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GetBytesTest {
	//OutputStream 은 문자열 쓰기를 지원하지 않지만
	//String 클래스에 getBytes()을 지원해 줌 
	public static void main(String[] args) {
		try(OutputStream os = new FileOutputStream("C:/File/out.txt");) {
			
			String data = "안녕하세요\n좋은 하루 되세요~\n Hey Wutup";
			
			os.write(data.getBytes());
			
			os.flush(); // 잔류 버퍼 비우기
			//os.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
