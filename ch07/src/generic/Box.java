package generic;

public class Box<T> {
	
	private T type;
	
	public void set(T type) {
		this.type= type;
	}
	
	public T get() {
		return type;
	}
}
