package ch14_exception_1025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {// 실험장 -> 실험하다가 문제가 발생하면 던짐 -> CATCH 키워드에게 던짐
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) { //  CATCH 키워드 예외를 받아서 처리함
//			System.out.println(e);
//			e.printStackTrace();
			return;
		}finally{ //RETURN 값의 여부에 상관없이 반드시 실행되는 영역
			//보통, 자원을 반납할 때 주로 사용
			//지원, 해당 디비 서버에 연결하기 위한 객체들이 있는데
			//접속 시에만 필요하고 그 뒤에 필요가 없어서 보통 반납을 함
			System.out.println("FINALLY 안쪽 1번");
			
			if(fis != null){ // 널이 아닌 경우에만 들어옴 (실행이됨), A.TXT가 있으면 이게 실행이됨 없이면 실행안됨
				System.out.println("FINALLY 안쪽 2번");
				try {
					System.out.println("FINALLY 안쪽 3번: CLOSE메소드 호출 전");
					fis.close(); // 자원 반납. 사용 했던 메모리는 사용 후 , 꼭 반납을 해야지 메모리 누수가 발생x.
					System.out.println("FINALLY 안쪽 3번: CLOSE메소드 호출 후");
				} catch (IOException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
				}
			}
			System.out.println("항상 수행 됩니다.");
		}
		System.out.println("여기도 수행됩니다.");
	}
}





