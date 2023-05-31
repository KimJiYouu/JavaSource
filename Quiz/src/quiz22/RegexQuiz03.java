package quiz22;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {

	public static void main(String[] args) {
		//1. 버퍼리더를 사용해서 건담.txt 를 읽어들임
		//2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로 패턴분석
		//   Product객체에 저장하고, 리스트에 저장
		//3. 외부라이브러리(POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록 하는 기능
        //   하나에 시트에 각 행테이터를 엑셀로 파일로 출력.
		//4. 엑셀로 추출
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.txt";
		
		String pattern1 = "[0-9]{8}-[0-9]{2}-[0-9]+";
		String pattern2 = "[가-힣]+ [가-힣]+";
		String pattern3 = "\\[[A-Z]*[가-힣]*\\]";
		String pattern5 = "[0-9]+,*[0-9]+원";
		
		
		List<Product> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String result;
			while((result = br.readLine()) != null) {
				
				Matcher m1 = Pattern.compile(pattern1).matcher(result);
				Matcher m2 = Pattern.compile(pattern2).matcher(result);
				Matcher m3 = Pattern.compile(pattern3).matcher(result);
				Matcher m5 = Pattern.compile(pattern5).matcher(result);
				
				String str = result.trim();
				str = str.substring(result.indexOf("]")+2, str.lastIndexOf(" "));
				
				if(m1.find() && m2.find() && m3.find() && m5.find()) {
					
					Product product = new Product(m1.group(), m2.group(), m3.group(), str , m5.group());
					list.add(product);
				}
				
			}

			XSSFWorkbook work = new XSSFWorkbook();
			XSSFSheet sheet = work.createSheet("sheet1");
			Row dataRow;
			dataRow = sheet.createRow(0);
			dataRow.createCell(0).setCellValue("날짜");
			dataRow.createCell(1).setCellValue("상점");
			dataRow.createCell(2).setCellValue("등급");
			dataRow.createCell(3).setCellValue("모델명");
			dataRow.createCell(4).setCellValue("가격");
			
			for(int i = 1; i < 23; i++) {
				
				dataRow = sheet.createRow(i);
				
				for(int j = 0; j <5; j++) {
					
					if(j == 0) {
						dataRow.createCell(j).setCellValue(list.get(i-1).getDay());
					} else if(j == 1) {
						dataRow.createCell(j).setCellValue(list.get(i-1).getStore());
					} else if(j == 2) {
						dataRow.createCell(j).setCellValue(list.get(i-1).getGrade());
					} else if(j == 3) {
						dataRow.createCell(j).setCellValue(list.get(i-1).getDetail());
					} else {
						dataRow.createCell(j).setCellValue(list.get(i-1).getPrice());
					}
				}
			}
			
			FileOutputStream fileOut = new FileOutputStream("output.xlsx");
			work.write(fileOut);
			fileOut.close();
			work.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
