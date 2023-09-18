package abstracts.animal;

public class AnimalTest {

	public static void main(String[] args) {
		
		//Cat클래스의 인스턴스로 생성 
		/*
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();*/
		
		
		//다향성으로 생성해봅시다..!
		Animal cat = new Cat();
		cat.breathe();
		cat.sound(); 
		
		Animal dog = new Dog();
		dog.breathe();
		dog.sound();
		
		System.out.println("===================");
		//매서드의 매개변수의 다향성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	//매서드의 매개변수의 다향성
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	

}
