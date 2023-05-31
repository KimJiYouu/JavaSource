package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FIleQuiz02 {
	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 "현재날짜file" 폴더를 생성합니다 
		 * 2. 스캐너로 파일명을 입력받고
		 * BufferedWriter를 이용해서 .txt파일을 생성합니다. 
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다. \r\n을
		 * 적절하게 이용해서 파일 출력을 완료
		 * 
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */

		////////// 1번 ///////////
		Date day = new Date();
		SimpleDateFormat day2 = new SimpleDateFormat("yyyyMMdd");
		String today = day2.format(day);

		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + today + "file";

		File file = new File(path);
		try {

			if (file.exists() == false) {
				file.mkdir();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		////////// 2번 ///////////
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String fileName = null;

		System.out.print("파일명입력> ");
		try {
			fileName = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String path2 = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + today + "file\\" + fileName + ".txt";

		/////////// 3번 ///////////
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))) {

			while (true) {
				String intext = br.readLine();

				if (intext.equals("그만"))
					break;
				bw.write(intext + '\n');
				bw.flush();

			}

			br.close();

		} catch (Exception e) {
		}

		////////// 4번 ///////////
		try (BufferedReader wer = new BufferedReader(new FileReader(path2))) {
			String result;
			while ((result = wer.readLine()) != null) {
				System.out.println(result);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
