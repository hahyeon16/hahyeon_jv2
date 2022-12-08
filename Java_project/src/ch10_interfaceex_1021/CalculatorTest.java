package ch10_interfaceex_1021;

import ch08_polymorphism_1020.AnimalTest3;
import ch13_stream_1025.CalculateGrade;

public class CalculatorTest {

	public void testInterfaceMethod(Calc calc) {
		// 테스트(test) 메서드에 올 수 있는 매개변수 형은 무엇인가요?
		//Calc를 포함한, Calc 인터페이스를 구현한 하위 클래스 모두가 올 수 있다.!!! : calculator, completecalc
		
	}
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		
		//다형성, 인터페이스 Calc 를 구현을 하면 ,마치 상속에서 부모 클래스 형으로 받듯이, 해당 구현한 인터페이스 형으로도 받을 수 있습니다.
		
		Calculator calculator = calc; //calc은 자식, 자식을 부모형으로 담음 calculator가 부모
		Calc calc2 = calculator; //마치 calc이 calculator의 부모인 것 처럼 담아짐(실제로는 부모는 아니고 calc는 인터페이스임)
				//Calculator calculator = new Calculator(); // 추상 클래스는 객체를 생성할 수 없음 막연한 것이라서 
		Calc newCalc = calc; // calc인터페이스를 calc형으로 받고 있음
		
		Test t1 = new Test();
		Calc calc3 = t1;
	    Test t2 = (Test)calc3;
		
	    
		calc.description();   //디폴트 메소드 호출
				
	    int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));  //정적 메소드 사용하기

	}
}
