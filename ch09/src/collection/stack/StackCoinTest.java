package collection.stack;

import java.util.Stack;

public class StackCoinTest {

	public static void main(String[] args) {
		//Stack 자료 구조의 객체 생성
		Stack<Coin> coinBox = new Stack<>();
		
		//Coin 객체 생성 
		Coin coin5000 = new Coin(5000);
		Coin coin100 = new Coin(100);
		Coin coin10 = new Coin(10);
		Coin coin1 = new Coin(1);
		
		//동전 넣기 (저장)[5000 -100-10-1]
		coinBox.push(coin5000);
		coinBox.push(coin100);
		coinBox.push(coin10);
		coinBox.push(coin1);
		
		//get으로 가져오기 
		//맨위에 1원 꺼내옴
		//int coin = coinBox.get(1).getMoney();
		int coin11 = coinBox.pop().getMoney();
		System.out.println(coin11);
		
		//전체 객체 출력 - 밖으로 나오면서 remove 
		while(!coinBox.isEmpty()) { //코인박스가 비어있지않다면
			Coin coin = coinBox.pop();
			System.out.println(coin.getMoney());
		}
		
	}

}
