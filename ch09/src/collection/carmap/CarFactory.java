package collection.carmap;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {	
	//자동차 를 생성할 때 - HashMap에 저장
	private static CarFactory instance;
	private Map<String, Car> carMap = new HashMap<>();
	
	private CarFactory() {}
	
	public static CarFactory getInstance(){
		if(instance == null){ 
			instance = new CarFactory();
		}
		return instance;
	}
	
	//자동차 생성 메서드
	public Car createCar(String name){ //차 이름 (key)
		if(carMap.containsKey(name)) { //carmap에 이름key 가 있으면 
			return carMap.get(name); //return 해줘야지 true 나옴 //이름을가져오면서car 변환
			
		}
		
		//Car 객체 생성
		Car car = new Car();
		//carMap에  name 과  Car 저장
		carMap.put(name, car);
		return car;
	}
	

}
