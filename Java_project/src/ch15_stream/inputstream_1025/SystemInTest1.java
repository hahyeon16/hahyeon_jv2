package ch15_stream.inputstream_1025;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("콘솔 창에 알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {//바이트 단위로 읽어서 해당 알파벳의 아스키 코드 값을 정수로 반환
			//반환 된 정수를 다시 원래의 문자 타입으로 형변환 해서 출력
			// 재활용 안되고 다시 지우고 콘솔에 써서 실행해야 함
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i); // 예를 들어 콘솔창에 a 입력했을 때 int로 출력해서(97) 문자로 형변환 함(a)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
