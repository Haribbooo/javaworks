package nestedclass;

class A{
	
	A(){
		System.out.println("A 객체 생성");
	}
	
	//내부 인스턴스 멤버 클래스
	class B{
		
		int Field1;
		//static int field2; // 내부 클래스에서는 static 변수가 만들어지지 X 
		B(){System.out.println("B 객체 생성");}
		
		void method1() {}
	}
	
	//내부 정적 멤버 클래스 
	static class C{
		
		int Field1;
		static int field2;
		
		C(){System.out.println("C 객체 생성");}
		
		void method1() {}
		static void method2() {}
	}
	//메서드 내부 로컬 클래스 사용
	void method() {
		class D{
			int field1;
			D(){System.out.println("D 객체 생성");}
			void method1( ) {};
		}
		//d 객체 생성
		D d = new D();
		d.field1 =10;
		d.method1();
	}
}
public class NestedClassTest {

	public static void main(String[] args) {
		//a 객체 생성
		A a = new A();
		
		//b 객체 생성
		A.B b = a.new B();
		b.Field1 = 3;
		b.method1();
		
		//c 객체 생성
		//static이 있으면 A.C 로 접근
		A.C c = new A.C();
		c.Field1 =2;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//D 클래스 의  method 사용
		a.method();
	}

}
