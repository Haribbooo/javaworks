package nestedclass.interfaces;

public class Button {
	//필드 - 인터페이스형 멤버 변수로 선언
	private OnClickListner listener;
	
	//내부 인터페이
	interface OnClickListner{
		public void onClick();
	}
	
	//외부에서 구현객체를 입력
	public void setListener(OnClickListner listener) {
		this.listener = listener;
	}
	
	//버튼 터치
	public void touch() {
		listener.onClick();
	}
}
