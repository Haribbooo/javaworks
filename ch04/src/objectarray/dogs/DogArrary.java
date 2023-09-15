package objectarray.dogs;

public class DogArrary {

	public static void main(String[] args) {
		//Dog 인스턴스 4개를 생성해서 배열에 저장하고
		
		Dog[] dogs = new Dog[4];
		
		dogs[0] = new Dog("하양이","시추");
		dogs[1] = new Dog("까망이","웰키코기");
		dogs[2] = new Dog("블루","진돗개");
		dogs[3] = new Dog("캬히","치와와");
		
		//출력
		for(int i = 0; i<dogs.length;i++) {
			System.out.println(dogs[i].getNmae()+","
								+dogs[i].getType());
		}
		
		//항샹된 for문
		for(Dog dog :dogs) {
			System.out.println(dog.getNmae()+","
								+dog.getType());
		}
		
								
		}
	
		
		
		
	}

