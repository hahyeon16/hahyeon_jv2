package ch09_abstractex_1020;

public abstract  class Computer { // 추상클래스입니다.

	public abstract void display(); // 추상메서드입니다., 몸체가 없고 메서드 선언부만 있음 , 막연한 추상메서드를 포함하는 클래스는 클래스에 추상클래스로 abstract키워드를 넣어줘야함
	
	public abstract void typing(); // 추상메서드입니다.
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}
