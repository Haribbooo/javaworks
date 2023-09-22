package funcinterface;

public class MyInterfaceMain {

	public static void main(String[] args) {
		
		MyFunction1 function;
		
		//람다식 표현 
		//매개변수 없음 - 비어있는 ( ) 사용 
		//코드가 1줄인 경우 { } 생략 가능
		
		/*
		function =() ->{
			System.out.println("Hellow");
		};*/
		
		function =() ->System.out.println("Heollow");
		
		function.method();
		}
	}	


