package customers;

public class Customer {
	
	protected int customerId;  //고객 아이디 
	protected String customerName; //고객 이름
	protected String customerGrade; //고객 등급
	int bonusPoint;						//보너스 포인트
	double bonusRatio; 					//보너스 적립률
	
	public Customer() {
		customerGrade ="SILVER"; // 기본등급
		bonusRatio= 0.01;   //1%		
	}
	
	public Customer(int customerId , String customerName) {
		this.customerId = customerId;
		this.customerName =customerName;
		customerGrade ="SILVER"; // 기본등급
		bonusRatio= 0.01;   //1%	
	}
	//매개변수가 없어서 set로 설정
	
	public void setCustomerId(int customerId) { //아이디 입력
		this.customerId = customerId;
	}
	public int getCustomerI() { //아이디 출력
		return customerId;
	}
	public void setCustomerName(String customerName) { //이름 입력
		this.customerName= customerName;
	}
	public String getCustomerName() { //이름 출력
		return customerName;
	}
	//보너스 포인트 계산
	public int calcPrice(int price) {
		bonusPoint +=(int)( price*bonusRatio);
		return price;
		
	}
	
	//정보출력
	
	public String showCustomerInfo() {
		return customerName+"의 등급: " + customerGrade+
				"이며"+ "보너스 포인트:" + bonusPoint;
	}

}
