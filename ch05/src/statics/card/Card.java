package statics.card;

public class Card {
	private static int seriralNum = 10000; // 클래스 변수
	private int cardNumber;
	
	public Card() {
		seriralNum++;
		cardNumber =seriralNum;
	}	
	public int getCardNumber() {
		return cardNumber;
	}

}
