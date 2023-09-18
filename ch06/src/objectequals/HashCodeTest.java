package objectequals;

class Employee{
	//필드 - 멤버 변수 , 인스턴스 변수 
	int empId;   //사번
	String empName; // 이름 
	
	Employee(int empId, String empName){
		this.empId =empId;
		this.empName = empName;
	}
	
	//equals 매서드 재정의
	@Override
	public boolean equals(Object obj) {
		//논리적으로 문자열이 동일하도록 구현
		if(obj instanceof Employee) {//obj 가 Employee의 인스턴스라면
			Employee employee = (Employee) obj; // 다운캐스팅(강제 형변환)
			if(this.empId == employee.empId)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() { // int형이니까 그냥 그대로 쓴다 문자형일 경우는 ~~~hashcode로 바꿔준다
		return empId;
	}			
}


public class HashCodeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "장은호");
		Employee emp2 = new Employee(101, "장은호");
		
		System.out.println(emp1 == emp2); //false
		System.out.println(emp1.equals(emp2)); //false 재정의 하면 true
		
		//hashCode 값 비교  // override 안했으면 101, 101 이렇게 안나옴
		//동등객체인지 확인(문자열의 일치 확인)
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		//실체 물리 주소	
		System.out.println(System.identityHashCode(emp1));
		System.out.println(System.identityHashCode(emp2));
	}
}
