package ch09_abstractex_1020;

public abstract class  NoteBook extends Computer{
// 노트북이 추상 클래스가 되어서 밑부분 메서드 재정의 해주지 않아도 됨
	@Override
	public void display() {
		System.out.println("NoteBook Display()");		
	}
	
}
