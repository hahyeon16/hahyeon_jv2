package ch06_cooperation_1019;

import ch05_test_1018.student2;

public class TakeTrans {

	public static void main(String[] args) {
		
		//추가 주문
		//카카오 택시 만들기->클래스를 추가 만들기.
		//기존 버스의 멤버 및 메서드를 최대한 활용하기(사실 복붙)
		//본인 이름으로 Student 객체를 생성해서 
		//카카오 택시 타고,
		//조건이 없어서 추가했음
		//해당 학생 클래스에 카카오 택시를 타는 것을 추가
		//해당 학생의 정보와 카카오 택시 정보를 출력 해보세요
		
		
		
		//객체 생성하기. 생성자는 매개변수가 2개인 생성자 호출해서 객체 만들기
		Student jhhStudent = new Student("정하현", 20000);
		Bus bus2 = new Bus(2);	
		jhhStudent.takeBus(bus2);
			//null은 해당 주소값이 아직 할당이 되지 않은 상태
		System.out.println("버스 2번 타고 남은 잔액");
		jhhStudent.showInfo();
		
		
		Subway subway1 = new Subway("1");
		jhhStudent.takeSubway(subway1);
		System.out.println("지하철 1호선 타고 남은 잔액");
		jhhStudent.showInfo();
		System.out.println("2번 버스의 정보");
		bus2.showInfo();
		System.out.println("지하철 1호선의 정보");
		subway1.showInfo();
		
		Student jhhStudent2 = new Student("정하현2", 20000);
		jhhStudent2.takeSubway(subway1);
		jhhStudent2.takeBus(bus2);
		System.out.println("2번 버스의 정보");
		bus2.showInfo();
		System.out.println("지하철 1호선의 정보");
		subway1.showInfo();
		
		Student jhhStudent3 = new Student("정하현3", 20000);
		KakaoTaxi KakaoTaxi500 = new KakaoTaxi("500번");	
		jhhStudent3.takeTaxi(KakaoTaxi500);
		System.out.println("택시 500번 타고 남은 잔액");
		jhhStudent3.showInfo();
		System.out.println("500번 택시의 정보");
		KakaoTaxi500.showInfo();
		
		// 두 명의 학생을 생성
//		  Student studentJames = new Student("James", 5000);   
//		  Student studentTomas = new Student("Tomas", 10000);
//		  // 디버깅 한번 수행하고 ㅇ
//		  //본인 이름으로 생성하기. ㅇ
//		  // 버스, 지하철 타보기.
//		  // 택시 만들어서 타보세요.
//		  Student lsy = new Student("이상용씨", 20000);
//		  Bus bus103 = new Bus(103);
//		  lsy.takeBus(bus103);     // james가 100번 버스를 탐
//		  lsy.showInfo();           // james 정보 출력
//		  bus103.showInfo();                // 버스 정보 출력
//		  
//		  Subway subwayOrange = new Subway("1호선");  
//		  lsy.takeSubway(subwayOrange);  // Tomas가 2호선을 탐
//		  lsy.showInfo();                 // Tomas 정보 출력
//		  subwayOrange.showInfo(); 
//		   
//		  Bus bus100 = new Bus(100);
//		  studentJames.takeBus(bus100);     // james가 100번 버스를 탐
//		  studentJames.showInfo();           // james 정보 출력
//		  bus100.showInfo();                // 버스 정보 출력
//		  
//		  Subway subwayGreen = new Subway("2호선");  
//		  studentTomas.takeSubway(subwayGreen);  // Tomas가 2호선을 탐
//		  studentTomas.showInfo();                 // Tomas 정보 출력
//		  subwayGreen.showInfo();   
	}
}
