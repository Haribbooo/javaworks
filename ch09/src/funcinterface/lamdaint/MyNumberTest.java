package funcinterface.lamdaint;

public class MyNumberTest {

	public static void main(String[] args) {
		//인터페이스형 변수 선어
		MyNumber1 number;
		
		//변수의 람다식 저장
		//calculate( ) 구현함
		//매개변수가 1개인 경우 소괄호 생략 가능
		/*number = (x) ->{ //더하기 계산
			x = x + 10;
			System.out.println(x);
		};*/
		number = x -> System.out.println(x+10);
		
		//calculate() 호출
		number.calculate(1);
		
		//어떤 수를 제곱하는 함수 구현
		number = n -> System.out.println(n * n);
		number.calculate(2);
		
	}

}
