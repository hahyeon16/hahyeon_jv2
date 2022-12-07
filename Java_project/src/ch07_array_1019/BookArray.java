package ch07_array_1019;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		library[0] = new Book();
		library[1] = new Book("책","작가");
		
		for(int i=0; i<library.length; i++){
			System.out.println(library[i]);
		}		
	}
}
