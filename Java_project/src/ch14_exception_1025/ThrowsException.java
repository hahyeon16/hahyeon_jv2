package ch14_exception_1025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// 오류뜨면 1) 우리가 사용하는 클래스 파일이 있는지 확인            
	
	// class: 예약어: 클래스를 의미하는 것
	// Class: 실제 클래스 (반환형), 해당 loadClass의 리턴 값의 형
	public Class loadClass(String fileName, String className) throws  ClassNotFoundException, FileNotFoundException{ // loadclass 메서드는 직접 오류 처리하지 않고 throws로 미뤄서 처리
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException �߻�
		Class c = Class.forName(className);  //ClassNotFoundException �߻�
		return c;
	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a2.txt", "java.lang.String");  // 여기서 문제 발생: a2.txt 파일이 없어서 문제 발생한 것임
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}