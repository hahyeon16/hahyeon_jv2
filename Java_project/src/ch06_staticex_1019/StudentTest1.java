package ch06_staticex_1019;

import ch05_test_1018.student2;

public class StudentTest1 {

	public static void main(String[] args) {

		Student2 jhhStudent6 =new Student2();
		System.out.println(Student2.getSerialNum()); //private 으로 은닉되어 있어서 get 으로 접근해서 가져옴.
		Student2.setSerialNum(2000);
		System.out.println(Student2.getSerialNum());
		
		
		
		//Student1 클래스로 객체를 생성해서, 자동으로 학번이 어떻게 부여되는지 확인.
		Student1 jhhStudent3 = new Student1();
		System.out.println("jhhStudent3의 학번 : "+jhhStudent3.studentID);
		
		Student1 jhhStudent4 = new Student1();
		System.out.println("jhhStudent4의 학번 : "+jhhStudent4.studentID);
		
		Student1 jhhStudent5 = new Student1();
		System.out.println("jhhStudent5의 학번 : "+jhhStudent5.studentID);
		
		//static 키워드에 접근하는 방법
		//인스턴스 (객체를) 생성해서 접근: 비추 (예: jhhStudent 생성)
		//해당 클래스명으로 접근 (: 스테틱 클래스 명인 student 사용)
		Student jhhStudent = new Student();
		jhhStudent.setStudentName("정하현");
		System.out.println(jhhStudent.serialNum); //객체를 생성해서 접근하는것 권장하지 않음
		System.out.println(Student.serialNum); //스태틱 클래스 명을 이용해서 접근하기
		jhhStudent.serialNum++; //시리얼 넘버 값 변경, ++: 증가시킴
		System.out.println(jhhStudent.serialNum);
		System.out.println(Student.serialNum);
	
		System.out.println("jhhstudent2의 정보");
		Student jhhStudent2 = new Student();
		System.out.println(jhhStudent2.serialNum); //값은 똑같음
		// serialNum: 공유자원임
		
		
		
//		Student studentLee = new Student();
//		studentLee.setStudentName("이지원");
//		System.out.println(studentLee.serialNum); // 초깃값 출력
//		studentLee.serialNum++;					// static 변수 증가
//		System.out.println("현재 값 : " + studentLee.serialNum);
//		
//		Student studentSon = new Student();
//		studentSon.setStudentName("손수경");
//		studentSon.serialNum++;	
//		System.out.println("한번더 클래스 변수 값 증가하기. ");
//		System.out.println("studentSon 의 값" + studentSon.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee);
//		System.out.println("studentSon 의 값" + studentSon);
	}
}

