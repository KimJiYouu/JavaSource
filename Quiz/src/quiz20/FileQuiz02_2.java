package quiz20;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+now+"file";
		
		File fold = new File(path);
		if(fold.exists() == false) {
			fold.mkdir();
			System.out.println("폴더 생성완료");
		} else {
			System.out.println("해당 폴더가 이미 존재합니다");
		}
		
		
		System.out.print("파일명> ");
		String filename = scan.nextLine();
		
		String filepath ="C:\\Users\\user\\Desktop\\course\\java\\file\\"+now+"file\\"+filename+".txt";
		
		try( BufferedWriter bw = new BufferedWriter( new FileWriter(filepath, true)); BufferedReader br = new BufferedReader( new FileReader(filepath));) {
		
			/*쓰는 작업*/
			while(true) {
				System.out.print("> ");
				String str = scan.nextLine();
				
				if(str.equals("그만")) {
					System.out.println("종료합니다");
					break;
				}
				bw.write(str+"\n");
				bw.flush();
			}
			
			/*읽어들이는 작업*/
			String result;
			while((result = br.readLine()) != null) {
				System.out.println(result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
