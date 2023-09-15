package arrarys;

public class ArrayGuugudan {

	public static void main(String[] args) {

			//구구단 3단 출력 배열로 안하는거 
		
		 int dan =3 ;
		 
		 for(int i = 1; i<10;i++) {
			 System.out.println(dan + " X "+ "=" + dan*i);			 
		 }
		 System.out.println("=================");
		 
		 //배열을 사용해서 구구단 저장 및 출력
		 int[] gugudan = new int[9];
		 
		 //구구단 배열을 저장
		 for(int i = 0; i<gugudan.length; i++) {
			 // 배열 요소를 저장
			 gugudan[i] = dan*(i+1);
		 }
		 //구구단 배열 출력
		 for(int i = 0; i<gugudan.length; i++) {
			 //배열 요소를 출력
			 System.out.println(dan + "x" + (i+1) + "=" +gugudan[i]);
		 }
		 System.out.println("=================");
		 /* 내가 한거
		 for(int i = 0; i<gugudan.length; i++) {
			 System.out.println( dan + " x " + (i+1) + "=" + dan*(i+1));
		 }*/
		 
		 //배열 복사
		 int[] gugudan2 = new int[9];
		 
		 //1.일반 복사
		 for(int i = 0 ; i< gugudan2.length; i++) {
			 gugudan2[i] = gugudan[i];
		 } 
		 for(int i = 0 ; i< gugudan2.length; i++) {
			System.out.println(dan + "x" + (i+1) + "=" +gugudan2[i]);
		 }
		 System.out.println("=================");		 
		 //2.Object 클래스의 clone()
		 int[] gugudan3 = gugudan2.clone();
		 
		 for(int i = 0 ; i< gugudan2.length; i++) {
				System.out.println(dan + "x" + (i+1) + "=" +gugudan3[i]);
		 }
	}//main

}//class
