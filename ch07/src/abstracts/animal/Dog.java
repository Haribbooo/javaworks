package abstracts.animal;

public class Dog extends Animal{
	
	public Dog() {
		this.kind="하임이";
		System.out.println(kind);
	}

	@Override
	public void sound() {
		System.out.println("왈왈왈왈와왕루ㅏㄹ왈왈오라!!!");
	}
	

}
