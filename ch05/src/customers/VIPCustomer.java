package customers;

public class VIPCustomer extends Customer{
	private int agentId; //전문 상담원
	double saleRatio;  //구매 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";
		saleRatio = 0.1; //구매 할인율10%
		bonusRatio =0.05; //보너스 적립 5%
	}
	public VIPCustomer (int customerId , String customerName, int agentId) {
		super( customerId ,customerName);
		this.agentId = agentId;
		customerGrade = "VIP";
		saleRatio = 0.1; //구매 할인율10%
		bonusRatio =0.05; //보너스 적립 5%
	}
	
	public void setAgent(int agentId) {
		this.agentId= agentId;
	}
	// 구매 가격 = 가격 - ( 가격*구매할인율)
	@Override
	public int calcPrice(int price) {
		price -=(int)(price*saleRatio);
		bonusPoint +=(int)( price*bonusRatio);
		return price;
	}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n전문상담원ID는 "+ agentId+"입니다.";
	}
	
	
}
