package reference.circle;


//Point 자료형 생성
public class PointClass {
	//점의 좌표 -필드
	int x;
	int y; 
		
	
	public PointClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	public void showPointInfo() {
		System.out.println("점(" + x + "," + y +")");
	}
}
