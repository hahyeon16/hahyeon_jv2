package ch13_lambda_1025;

interface PrintString{
	
	void showString(String str);
} // 실전에서는 이렇게 직접 잘 안씀

public class TestLambda {

	public static void main(String[] args) {

		// PrintString 인터페이스형 -> 다형성
		PrintString lambdaStr = s->System.out.println(s);  //람다식을 변수에 대입
		lambdaStr.showString("hello lambda_1");
		
		showMyString(lambdaStr);                          //메서드 매개변수로 전달
		
		PrintString reStr = returnString();  
		reStr.showString("hello ");
		
	}
	
	public static void showMyString(PrintString p) { //매개변수의 자료형이 인터페이스 : 다형성 (프린트스트링이 인터페이스), 인터페이스를 매개변수에서 씀
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() { //(인터페이스를)반환 값으로 사용, 반환값으로 받을 변수가 필요함, 인터페이스형으로 받음(프린트스트링): 다형성으로 받고 있음
		return s->System.out.println(s + "world");
	}
}
