package kr.or.iei.model;

public class User {
	//필드 생성
	private String id;
	private String pw;
	private String name;
	
	public User() {// 생략되어있는 기본생성자 
		
	} // 생략되어있음 원래 !*/
	
	//매개변수가 있는 생성자를 만듬 (get set 안해도됨) 생략되어있는 기본 생성자를 사용해야된다.
	public  User(String id,String pw,String name) {
		this.id = id;
		this.pw = pw;
		this.name= name;
	}
	   
	//set 필드이름 () ,get 필드이름 ()함수	
	public void setId(String id) {
		this.id = id;		
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	 	
	
}
