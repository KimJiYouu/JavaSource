package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FIleQuiz01 {

	public static void main(String[] args) {
		
//		1. 스캐너를 통해서 파일명을 입력받음
//		2. 입력받은 파일을 filecopy로 복사해서 옮기기
//      3. 자원해제 주위
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일명입력>");
		String file1 = scan.next();
		
		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+file1+".png";
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\"+file1+"_copy.png";
		
		try(InputStream in = new FileInputStream(readPath); OutputStream out = new FileOutputStream(writePath);) {
			
			byte[]arr = new byte[2048];
			int result;
			while((result = in.read(arr)) != -1) {
				out.write(arr, 0, result);
			}
			
		} catch(Exception e) {
			
		}
		scan.close();
	}
}
