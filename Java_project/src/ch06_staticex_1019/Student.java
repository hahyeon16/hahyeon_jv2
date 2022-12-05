package ch06_staticex_1019;

public class Student {
	
	//static 이라는 키워드를 사용해서, 전역 변수로 사용, 정적 변수, 다르게 표현 리소스라고 합니다.
	public static int serialNum = 1000;
	
	//인스턴스 변수(=none static 변수) -> 객체를 생성해서 접근
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 해당 메서드의 리턴 타입이 : string
	//활용한다면
	//ex) student jhh = new Student();
	//ex) string s1 = jhh.getStudentName();
	public String getStudentName(){
		return studentName; // 리턴값이 문자열임
	}
	
	public void setStudentName(String name){ //void 결과값 없음
		studentName = name; // studentName 앞에 this 써주는게 더 정확함
	}

	public static int getSerialNum() {
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
