package ch05_test_1018;

import ch15_stream.inputstream_1025.SystemInTest1;

public class student2 {
	String studentname; //이름
	int studentnum; //학번
	String email; //메일
	String location; //사는 곳
	//클래스 기본적인 멤버 변수를 선언만 했음
	//기본형을 제외하고는 참조형 변수 예) student2, string 등
	
	
	  public void studentGetInfo() { 
		  System.out.println("이름은 : "+studentname);
	  }
	
	
	public void sum(int num1, int num2) { //void 리턴의 결과값이 없다.
		
		System.out.println(num1+num2);
		
	}
	public static int sum2(int num1, int num2) { //void 리턴의 결과값이 없다.
		System.out.println("sum 함수를 호출한 결과값 출력 :"+ num1+num2); // 여기에서 출력됨
		
		return num1+num2; //결과값의 반환 타입이 int임을 나타냄.
		//해당 메서드 선언부에서 확인이 가능함.
	}
	
	public static void main(String[] args) {
		//메인 메서드가 먼저 호출되고 *
		
		//해당 객체를 생성하는 new 키워드 설명 안한 상태.
		student2 jhh = new student2(); //jhh 객체 생성 
		student2 jhh2 = new student2(); // jhh2 객체 생성
		jhh.studentname="정하현1";
		jhh2.studentname="정하현2";
		jhh.studentGetInfo();
		jhh2.studentGetInfo();
		// student2: 클래스 이름
		// jhh : 참조형 변수 이름
		// new: 키워드를 통해서 해당 객체를 생성
		// student2() : 매개변수가 없는 기본 생성자라고 함.
		// 역할은 기본값을 초기화하는 역할
		
		// 해당 객체를 통해서 함수를 호출
		jhh.sum(10, 20);
		
		// 지금은 객체 없이 해당 클래스 명으로 함수를 호출. static을 통해서
		int result = student2.sum2(10, 20);  // result를 int로 받음, int를 long으로 바꿔도 문제 없음(작은집>큰집이동)
		//두번째 sum2함수(메서드) 호출하는 부분
	}
	
	
}      