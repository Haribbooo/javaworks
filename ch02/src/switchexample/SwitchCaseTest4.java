package switchexample;

public class SwitchCaseTest4 {

	public static void main(String[] args) {
		// 특정 월이 며칠까지 있는지 출력 
		// 변수 - month ,day , 
		// 31 - 1 3 5 7 8 10 12 
		// 31 =  4 6 9 11
		// 28 = 2 (4년에 한번씩 29일)
		
		int month = 2;
		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8 : case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
				System.out.println(" 잘못된 접근 입니다. ");
		}
		System.out.println(month + " 월은 "+ day + " 일 까지 있다.");
	}

}
