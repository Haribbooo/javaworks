package interfaceex.sorting;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] numbers) {
		System.out.println("BublleSort ascending");
		
	}

	@Override
	public void descending(int[] numbers) {
		System.out.println("BublleSort descending");
		
	}
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubuleSort 입니다.");
	}



}
