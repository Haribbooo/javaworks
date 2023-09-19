package stringmethod;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		//StringBuilder , StringBuffer 문자열 변경이 가능한 클레스 (메모리 주소 유지)
		String javaStr = new String("java");
		
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(buffer);
		System.out.println("연산전 buffer 메모리 주소값:"+System.identityHashCode(javaStr));
		
		System.out.println("=====연결 후 ====");
		//문자열 추가 ,연결
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" nice guy EunHo");
		System.out.println(buffer);
		System.out.println("연산전 buffer 메모리 주소값:"+System.identityHashCode(javaStr));
	}

}
