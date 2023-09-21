package exceptions.resource;

public class MyResourceTest3 {

	public static void main(String[] args) throws Exception {
		//try~ with ~ resource 문
		//close 사용 X 
		//MyResource res1 = null;		
		try(MyResource res1 = new MyResource("res1");) {	
			
			
			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));				
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
