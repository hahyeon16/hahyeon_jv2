package ch15_stream.inputstream_1025;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
		
			System.out.println((char)fis.read()); // 읽어서 (read) 출력,읽어서 문자로 바꿔서 콘솔창에 출력, read는 하나씩 출력 -> 반복문으로 돌려서 출력하기
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		
		} catch (IOException e) {
			System.out.println(e);
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e){
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
