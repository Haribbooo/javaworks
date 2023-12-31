package nestedclass;

//지역 내부 클래스
class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	//메서드 - MyRunnable 클래스 
	Runnable getRunnable() {
		int num = 10 ; // 로컬 변수  //   run에서 변경 못함 final 있어서 
		
		class MyRunnable implements Runnable{
			int localNum = 20;

			@Override
			public void run() {
				// num =20 ; 상수로 변환되어 변경할 수 없음 
				localNum =30;
				System.out.println(outNum + "(외부클래스의 인스턴스 변수)");
				System.out.println(sNum + "(외부클래스의 정적 변수)");
				System.out.println(localNum + "(내부클래스의 멤버 변수)");
				System.out.println(num);
			}
			
		}		
		MyRunnable myRun = new MyRunnable();
		return myRun;		
		//return new MyRunnable(); //같은거임
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
		
	}

}
