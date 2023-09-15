package hiding.account;

// 은행 통장 계좌 자료형 생성
//정보 은닉 및 캡슐화 - private 사용 
public class Account {
	//필드
	private String ano;   // 계좌 번호
	private String owner; // 계좌주
	private int balance;  // 잔고
	
	//생략된 기본 생성자 -set을 씀
	public Account() {}
	
	//매개변수가 있는 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner =owner;     //같은 이름의 변수를 쓸때는 this.을 붙힌다.
		this.balance = balance;
	}
	
	
	//get(), set () 메소드 
	// 만드는 방법 : set + 필드이름()- 필드이름 첫글자는 대문자
	public void setAno(String a){ // 매개변수로 계좌번호 전달 set-입력 get-출력
		ano = a;
	}
	public String getAno(){
		return ano;
	}
	public void setOwner(String own){
		owner = own;
	}
	public String getOwner(){
		return owner;
	}
	public void setBalance(int bal) {
		balance= bal;
	}
	public int getBalance() {
		return balance;
	}
}
