package ch07_array_1019;

public class EnhancedForLoop {

	public static void main(String[] args) {

		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray){// strArray:여러개를 담는 그릇, Java...을 lang에 담아서  밑에서 출력
			System.out.println(lang);
		}
	}
}
