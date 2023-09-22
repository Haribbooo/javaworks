package funcinterface.lamdastring;

public class StingConcatTest1 {

	public static void main(String[] args) {
		
		StringConcatImpl concat = new StringConcatImpl();
		String str1 = "멋쟁이";
		String str2 = " 으노 ";
		concat.makeString(str1,str2);
		
	}

}
