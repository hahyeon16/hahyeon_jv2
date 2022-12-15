package ch15_stream.others_1025;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		
		// C:\Java_workspace_2\Java_project_copy\Java_project : 절대 경로
		// . : 점은 현재위치, ./ : 현재 폴더를 기준으로 하위
		// ..부모폴더 : 상대경로
//		File file = new File("C:\\Temp\\newFile.txt");
//		File file = new File("C:\\Java_Workspace\\Java_EX\\src\\ch15_stream\\others_1025\\newFile.txt");
//		File file = new File("C:\\Java_workspace_2\\Java_project_copy\\Java_project.txt");
		File file = new File("C:\\Temp\\upload.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		//file.delete();
		
		
		
		
		
		
		
		
		
		
	}
}
