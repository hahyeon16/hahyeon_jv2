package ch07_array_1019;

import ch05_test.PersonTest;
import ch11_classex_1024.Person;

public class ArrayTest {

	public static void main(String[] args) {

		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		String[] str1 = new String[] {"jhh", "jhh2"}; // str1에 변수 두개가 들어감 jhh,jhh2
		Person[] persons = new Person[] {new Person(), new Person()}; //new Person(): 하나의 주소값
		
		for(int i=0; i<number.length; i++){
			 System.out.println(number[i]);
		}
	}
}
