package ch05_test;

public class PersonTest {
	
	 public static void main(String[] args) {
		 // 기본 생성자 호출
		  Person jhh = new Person();
		  //데이터에 직접 접근 할거냐?
//		  jhh.name = "정하현";
		  jhh.height= 170F;
		  jhh.weight=45F;
		  
		  //set(메서드)을 이용해서 name 값 설정하기
		  jhh.setName("정하현 (setter로 추가했음)"); // SET이라는 메서드를 이용함
		  jhh.showInfo();
		  //get(메서드)를 이용할 것이냐?
		  System.out.println("get메서드로 이름호출 : "+jhh.getName());
		  
		  
		  
		  //매개변수가 1개인 생성자를 호출
		  Person jhh2 = new Person("정하현");
		  
		  jhh2.height= 170F;
		  jhh2.weight=60F;
		  jhh2.showInfo();
		  
		  //매개변수가 3개인 생성자를 호출
		  Person jhh3 = new Person("정하현", 170F,70F);
		  jhh3.showInfo();
		  
//		  personKim.name = "������";
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
//		
//		  Person personLee = new Person("�̼���", 175, 75);
	 }
}
