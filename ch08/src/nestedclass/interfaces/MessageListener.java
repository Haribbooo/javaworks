package nestedclass.interfaces;

//문자를 보냅니다 구현
public class MessageListener implements Button.OnClickListner {

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
	}
	
	 

}
