package ch10_bookshelf_1021;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	// 상속을 받은 클래스에서 보인다
	
	
	public Shelf(){
		// 기본 생성자, 즉 Shelf 를 만들면, 자동으로 ArrayList가 만들어진다. 
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount(){
		return shelf.size();
	}
}
