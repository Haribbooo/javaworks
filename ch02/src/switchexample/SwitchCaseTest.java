package switchexample;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// 랭킹에 따른 메달 출력
		// 1등=금 2등=은 3등 =동
		// 변수 - rank
		int rank = 1;
		
		switch(rank) { //switch(변수)
		case 1: // ;이거 아님 :이거임
			System.out.println("금메달 입니다.");
			break; // 매 case 마다 break 해야댐
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3:
			System.out.println("동메달 입니다.");
			break;
		default://case가 없는 경우에 처리 
			System.out.println("메달이 없습니다.");
			break;
		}
	}

}
