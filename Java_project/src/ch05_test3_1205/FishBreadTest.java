package ch05_test3_1205;

public class FishBreadTest {

	public static void main(String[] args) {
		//클래스명 참조형변수(객체이름) = new 클래스명();(소괄호 되어있는것은 생성자를 의미함)
		FishBread fishbread1 = new FishBread();
		//기본 생성자 : FishBread();
		//기본 생성자는 해당 변수에 처음에 값을 할당하는 역할, 초기화라고 이야기함.
		//변수 : powder : String, redbean : String, 기본적으로
		//값을 할당을 하지 않아서, 기본값이 null -> 해당 참조형(주소값) 할당이 안되었음.
		fishbread1.setPowder("정하현 기법의 반죽(사실 빵가루임...)");
		fishbread1.setRedbean("설탕(갈색 설탕)을 추가한 팥");
		fishbread1.showInfo();
		System.out.println("붕어빵1의 참조형 변수가 가리키는 값 : " +fishbread1);
		
		FishBread fishbread2 = new FishBread("빵가루2", "설탕 팥");
		fishbread2.showInfo();
		System.out.println("붕어빵2의 참조형 변수가 가리키는 값 : " +fishbread1);
		
		
		FishBread fishbread3 = new FishBread("빵가루3", "달달한 팥");
		fishbread3.showInfo();
	}

}
