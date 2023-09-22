package funcinterface.lamdastring;

//StringConcat 인터페이스를 구현한 STringConCatImpl
public class StringConcatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + " " + s2);		
	}

}
