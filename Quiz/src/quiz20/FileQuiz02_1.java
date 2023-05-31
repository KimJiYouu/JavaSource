package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileQuiz02_1 {

	public static void main(String[] args) {
		
		
//		String fileName = null;
//		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//			
//			System.out.print("파일명입력> ");
//			
//			fileName = br.readLine();
//		}catch(Exception e) {
//			
//		}
//		
//
//		String path2 = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+ fileName + ".txt";
//
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))) {
//			BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
//				
//				while(true) {
//					String intext = brr.readLine();
//					
//					if (!intext.equals("그만")) {
//						
//						bw.write(intext+'\n');
//						bw.flush();
//					} else
//						return;
//					brr.close();
//				}
//		} catch (Exception e) {
//		}
		
		
		String fileName = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("파일명입력> ");
			
			try {
				fileName = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		

		String path2 = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+ fileName + ".txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))) {
			try(BufferedReader brr = new BufferedReader(new InputStreamReader(System.in))){
				while(true) {
					String intext = brr.readLine();
					
					if (!intext.equals("그만")) {
						
						bw.write(intext+'\n');
						bw.flush();
					} else
						break;
				}
				
			}catch(Exception e) {
				
			}
				
		} catch (Exception e) {
		}
	}

}
