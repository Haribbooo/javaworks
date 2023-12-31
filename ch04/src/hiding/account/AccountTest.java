package hiding.account;

public class AccountTest {

	public static void main(String[] args) {
		// Account인스턴스 생성
		Account account = new Account();
		
		// 멤버에 직접 접근하기 못하도록 제한을 둠
		//account.ano = 11-222-3333 // private 있어서 안됨 set, get으로 접근
		// 멤버 메서드에 접근 가능
		account.setAno("11-222-3333");
		account.setOwner("최은호");
		account.setBalance(10000);
		
		// 계좌번호 출력
		System.out.println("계좌번호:" +account.getAno());
		System.out.println("계좌주:" +account.getOwner());
		System.out.println("금액: "+account.getBalance()+"원");
		//System.out.println(account.ano);

	}

}
