package array2d;

public class ArrayAlphabet2 {

	public static void main(String[] args) {
		// 2차원 배열에 알파뱃 대문자 저장하기
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++;
			}
		}
		//배열요소 출력

		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				System.out.print(alphabets[i][j]+" ");
			}
			System.out.print("");  //행의 줄 바꿈 
 
		}
	}
}
 