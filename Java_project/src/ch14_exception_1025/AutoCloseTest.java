package ch14_exception_1025;

import java.io.FileInputStream;

public class AutoCloseTest {
	//이 클래스에서는 CLOSE()메서드를 직접 호출하는 부분이 없음
	//하지만 TRY WITH RESOURCE 구문으로 인해서 
	//자동으로 CLOSE() 출력되는 부분을 확인하는 예제
	
	//예외 발생의 여부에 상관없이 무조건 close() 호출됨.
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		//:TRY WITH RESOURCE 기본 구문
		//:매개변수에 직접적인 객체 들어왔다
		try (AutoCloseObj obj2 = obj){
			// 임의로 예외를 발생시키는 코드.(THROW): 예외를 강제로 발생 시킴
			//THROW VS. THROWS(던지기, 예외를 미루는 키워드)
			
			System.out.println("강제로 예외 발생 전 부분입니다.");
			
			throw new Exception();
//			System.out.println("강제로 예외 발생 후 부분입니다.");
		}catch(Exception e) {
			System.out.println("예외부분입니다.");
		}
	}
}
