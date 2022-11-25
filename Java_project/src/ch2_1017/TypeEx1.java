package ch2_1017;

public class TypeEx1 {
public static void main(String[] args) {
		
	
		byte b1=3; //b1을 선언(byte b1;), 초기화:최초에 값을 할당, 대입(byte b1=3;)
		int i1 = 200; // 작은집에서 큰집갈때 문제없음 ( byte i1 = b1;)
		byte b2 = (byte)i1; // 밑줄, 줄번호, 스크롤 빨간색: 문제 발생(byte b2 = i1), () 소괄호의 의미는 캐스팅 연산자(byte b2 = (byte) i1 :강제로 형변환 시킴)
		// 강제로 해당 소괄호안에 형으로 명시적, 강제적 형변환.
		//운 좋게 해당 갑이 담을 수 있다면 , 해당 값이 정상 출력 되지만 
		//만약, 담을 수 있는 범위를 넘어가는데, 강제로 형변환 하면,
		//의미 없는 값이 나옵니다. 값 손실이 발생 했다.
		System.out.println("b2 출력:"+ b2);
		//ctrl + m 이라는 단축키 해당 코드창만 작업으로 볼 수 있음
		System.out.println("b2 출력 강제로 형변환을 했는데 값의 범위 초과:"+ b2); // int i1에 200 값넣어줬을때 원래는 b1 넣어놨었음
		
	
		int i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
//		str = "test";
		
//		str = 3; //오류 남  
	}

}
