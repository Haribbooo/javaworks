package polymophism.animals;


class Animal{
	public void move() {
		System.out.println("동물이 움직입니다!");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("은호가 두발로 걷는중...");
	}   //클래스면 바로 {  }  	
}   /*public void move() {
		System.out.println("은호가 두발로 걷는중...");
	}
}    */

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 나는중..");
	}	
}	
	/*public void move() {		
		System.out.println("독수리가 하늘을 나는중..");
	}
	
}*/
class Tiger extends Animal{

	@Override
	public void move() {  //static 안하는 이유는 new 쓰려고 하는것 55번줄~57번줄 
		System.out.println("호랑이뛰는중..");
	}	
}
	/*public void move() {
		System.out.println("호랑이뛰는중..");
	}	
}*/
public class AnimalTest {
	
	//moveanimal () define //부모 타입 객체
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		//다향성(Animal 타입으로 객체 생성
		Animal human = new Human();  //
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		aTest.moveAnimal( human); // Animal animal = new Human ;
		aTest.moveAnimal( eagle);
		aTest.moveAnimal( tiger);
		
		//moveAnimal(human); //static를 붙인경우 호출한 상황으로 
		

	}

}
