package ch13_lambda_1025;

@FunctionalInterface // :컴파일러한테 이 인터페이스는 함수형 인터페이스라서 메서드가 하나라고 알려주는 것 
// 애너테이션을 사용하게 되면, 마치 유효성을 체크하는 것처럼 미리 1차 검사, 메서드를 만약 모르고 2개를 만들 경우, 문법을 확인해서 오류 발생함
public interface MyNumber {
	
	int getMax(int num1, int num2);
//	int getMax2(int num1, int num2); 넣으면 오류남 하나만 가능, @FunctionalInterface 했으니까/ 애너테이션 이 부분 주석 걸면 두 개 이상 넣어도 오류 안 뜸

}
