package nestedclass.interfaces;

public class ButtonTest {

	public static void main(String[] args) {
		
		//버튼 객체 생성
		
		Button button = new Button();
		
		//전화걸기 객체를 생성
		CallListener call = new CallListener();
		
		//문자를 보냅니다아
		//MessageListener msg = new MessageListener(); 이렇게해도되고
		
		//전화걸기
		button.setListener(call);
		button.touch();
		//call.OnClick(); 이방법으로 해도 가능
		
		//문자보내기
		button.setListener(new MessageListener()); //바로 넣어도됨
		button.touch();
		
		//사직찍기 구현
		button.setListener(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");				
			}
		});
		button.touch();
		
		//쇼핑 - 구매 구현
		button.setListener(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("상품을 구매합니다");
			}
		});
		button.touch();
	}

}
