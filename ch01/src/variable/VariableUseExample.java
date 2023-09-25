package variable;

public class VariableUseExample {

	public static void main(String[] args) {
		//시간을 분으로 환산하는 프로그램
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분");	
	}
}
