package hiding.account;

public class AccountTest2 {

	public static void main(String[] args) {
		Account account =new Account("11-222-3333","최은호",1000);
		
		// 계좌번호 출력
		System.out.println("계좌번호:" +account.getAno());
		System.out.println("계좌주:" +account.getOwner());
		System.out.println("금액: "+account.getBalance()+"원");
				


	}

}
