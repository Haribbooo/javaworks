package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		//for문 사용해서 출력
		/*
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c); //A의 코드값
		
		char c2= 66;
		System.out.println(c2); */
		System.out.println("일반 for문을 사용해서 알파벳 출력");
		char c;		
		for(c=65; c<=90;c++) {  //ch가 알파뱃 A(65)의 코드값을 적고 시작 
			System.out.print(c+" ");
		} 
		System.out.println("\n 변수의 마지막값 "+(char)( c -1 )); // Z 
		
		
		System.out.println(" == 알파뱃을 배열에 저장하고 출려역! ==");
		char[] alphabets =new char[26];
		char ch = 'A';
		
		//alphabets[0] = ch;
		//System.out.println(alphabets[0]); //A	
		//alphabets[1] = (char)(ch +1); //문자열을 1더할때 (char)를 앞에서 넣어준다 int형으로 변환하기 때문에 형변환 필요
		//ch++; // ch = ch+1 (1증가)
		//alphabets[1] =ch;
		//System.out.println(alphabets[1]); //B
		
		//전체 출력
		// 알파벳을 배열에 저장 1증가 
		for(int i = 0; i < alphabets.length; i++) {
			alphabets[i]= ch;
			ch++;			
		}
		//알파벳 출력
		for(int i = 0; i < alphabets.length; i++) {
			System.out.print(alphabets[i]+" ");		

	}

	}
}
