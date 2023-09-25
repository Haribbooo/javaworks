package datainputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		
		//close() 사용하지 않는 방법 : try ~ with~ resource 문 
		String originFile = "C:/File/MSMS.jpg";
		String copyFile = "C:/File/MSMS2.jpg";
		long start, end;
		
		try(InputStream is = new FileInputStream( originFile);
			OutputStream os = new FileOutputStream(copyFile);){
			start = System.currentTimeMillis(); // 복사한 시간 
			
			while(true) {
				int num = is.read(); //읽은 바이트 수 
				if(num == -1)break;
				os.write(num); //파일에 쓰기				
			}
			os.flush(); 
			
			end = System.currentTimeMillis(); //복사한 시간 
			System.out.println("복사에 걸린 시간 "+ (end -start) +"ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
