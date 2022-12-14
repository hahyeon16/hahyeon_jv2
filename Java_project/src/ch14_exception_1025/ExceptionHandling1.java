package ch14_exception_1025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//a.txt 파일 위치의 기준은 해당 프로젝트 (프로젝트 파일 안에 파일을 집어넣어야함) 
			 fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
		 	System.out.println(e);
			//return;
//			e.printStackTrace();
		} 
		System.out.println("여기도 수행됨..");
	}
}
