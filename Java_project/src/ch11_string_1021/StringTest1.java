package ch11_string_1021;

public class StringTest1 {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);    //false
		System.out.println(str1.equals(str2)); //true string의 equals이기 때문에 같음. object 꺼라면 다름
	
		String str3 = "abc";
		String str4 = "abc"; //값이 저장되어 있는 상수풀을 써서 똑같이 호출해서 사용
	
		System.out.println(str3 == str4);  //true
		System.out.println(str3.equals(str4)); //true
	}
}
