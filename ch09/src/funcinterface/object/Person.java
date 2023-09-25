package funcinterface.object;

public class Person { // Person 이  Workalbe를 사용할 수 있음 
	void action(Workable workable) {
		workable.work();
	}

}
