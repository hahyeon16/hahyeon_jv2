package ch05_test3_1205;

public class FishBread {
	private String powder; //반죽
	private String redbean; //팥
	
	//실제 데이터에 접근을 하는 방법
	//직접 접근 할거냐?, set/get 라는 메서드 이용할거냐?
	//예) 직접 접근 객체명. 변수
	//예2) getPowder() 메서드로 접근.
	//자동으로 해당 멤버들에 대해서 set/get 자동으로 만들었음.
	
	//기본 생성자 -> jvm이 자동으로 만들어줌. 조건) 해당 생성자가 하나도 없을 경우.
	//오버로드 -> 매개 변수가 2개인 생성자를 만들기.
	
	public FishBread() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수가 2개인 생성자 ->자동으로 만듬
	public FishBread(String powder, String redbean) {
		super(); //상속으라는 개념을 통해서 부모 클래스, 상위 클래스를 호출 할 때 사용하는 키워드, 초기화 하는 역할.
		//암암리에 Object 최고상위 클래스 상속을 받아둠.
		this.powder = powder;
		this.redbean = redbean;
	}
	
	public String getPowder() {
		return powder;
	}

	public void setPowder(String powder) {
		this.powder = powder;
	}
	public String getRedbean() {
		return redbean;
	}
	public void setRedbean(String redbean) {
		this.redbean = redbean;
	}
	
	public void showInfo() { //s 소문자 시작
		System.out.println("현재 반죽은 : " + powder + ", 현재 팥은 : " + redbean);
		
	}
}
