package objectarray.dogs;

public class Dog {
	private String name; // 다른 클래스 패키지에서는 안되고 같은 패키지 보내줌
	private String type;
	
	public Dog( String name,String type) {
		this.name = name;
		this.type = type;
		
	}
	
	//get () 함수
	
	public String getNmae() {
		return name;
	}
	public String getType(){
		return type;
	}
	

}
