package polymophism.animals2;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
	}	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}	
}

class Tiger extends Animal {

	@Override
	public void move() {
	System.out.println("호랑이가 네발로 뜁니다.");
	}		
	public void hunting() {
	System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다..");
	}		
	public void flying() {
		System.out.println("독수리가 구애의 몸짓을..");		
	}
}

public class AnimalTest {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		//Animal의 move() 매서드 호출
	    //moveAnimal()호출
	    aTest.moveAnimal(new Human());
	    aTest.moveAnimal(new Tiger());
	    aTest.moveAnimal(new Eagle());
	    
	    //Animal 타입으로 객체 생성 
	 	System.out.println("=====원래 형으로 다운 캐스팅 =====");
	 	//크기가 3인 Animal 인스턴스를 저장할 배열을 생성 
	 	Animal [] animals = new Animal[3];
	 	
	 	//자식 객체 생성
	 	animals[0] = new Human();
	 	animals[1] = new Tiger();
	 	animals[2] = new Eagle();
	 	
	 	for(int i = 0 ; i <animals.length; i++) { // 배열을 순환하면서
	 		Animal animal = animals[i]; //0번 인덱스부터 객체 저장 
	 		if(animal instanceof Human) {
	 			Human human = (Human)animal; // Human 타입 강제 형변환 
	 			human.readBook();
	 		}else if(animal instanceof Tiger) {
	 			Tiger tiger =(Tiger) animal; //Tiger 타입 강제 형변환
	 			tiger.hunting();
	 		}else if(animal instanceof Eagle) {
	 			Eagle eagle =(Eagle) animal; //Eagle 타입 강제 형변환
	 			eagle.flying();
	 		}else {
	 			System.out.println("지원하지 않는 타입입니다.");
	 		}
	 	}
	 	
	 	
	 	/*
	    Animal human = new Human();
	    Animal tiger = new Tiger();
	    Animal eagle = new Eagle();
	    
	    
	   //강제 형변환  instanceof 키워드 사용		    	
		if(human instanceof Human) { //
		    Human h = (Human) human; //자식타입 + 부모타입
		    h.readBook();
		}
		if(tiger instanceof Tiger) {
		    Tiger t =(Tiger) tiger;
		    t.hunting();		    	
		}
		if(eagle instanceof Eagle) {
			Eagle e = (Eagle) eagle;
			e.flying();			
		}*/
	    

	}

}
