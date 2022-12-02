package ch05_test_1018;

import ch13_lambda_1025.StringConCatImpl;

public class AniTest {

	public static void main(String[] args) {
		// 객체를 생성
		//클래스명 참조형_변수 =new 클래스의 기본 생성자();
		//dog라는 이름의(참조형)변수를 선언
		//객체를 생성했음.
		
		Animal dog = new  Animal(); //new는 객체를 생성하기 위한 예약어
		//강아지의 이름, 나이 설정
		dog.name="강아지";
		dog.age=1;
		//기본 메서드 하나 출력
		dog.showInfo();
		System.out.println("dog의 주소값");
		System.out.println(dog);
		System.out.println(dog.name);
		System.out.println(dog.age);
		//고양이 객체 생성, 이름과 나이 지정해서 출력 한번 해보기
		Animal cat = new Animal();
		cat.name="고양이";
	
		cat.age=3;
		cat.showInfo();
		System.out.println("cat의 주소값");
		System.out.println(cat);
		
		Animal elephant = new Animal();
		elephant.name = "코끼리";
		elephant.age = 50;
		elephant.showInfo(); 
	}

}
