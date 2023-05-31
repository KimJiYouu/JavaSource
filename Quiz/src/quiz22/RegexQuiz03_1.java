package quiz22;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03_1 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String str;
			while ((str = br.readLine()) != null) {

				String pattern1 = "[0-9]{8}-[0-9]{2}-[0-9]{12,13}";
				String pattern2 = "[가-힣]+ [가-힣]+(점|)";
				String pattern3 = "\\[[가-힣A-Z]+\\]";
				String pattern4 = "\\d+,*\\d+원";

				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m4 = Pattern.compile(pattern4).matcher(str);

				if (m1.find() && m2.find() && m3.find() && m4.find()) {
//					System.out.println("===================");
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					String price = m4.group();
					String detail = str.substring(m3.end() + 1, m4.start() - 1);

					Product product = new Product(day, store, grade, detail, price);
					list.add(product);
				}
			}

			// 엑셀 쓰기 호출
			creatExcel(list);

		} catch (Exception e) {
		}
	}

	public static void creatExcel(List<Product> list) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		// 시트
		XSSFSheet sheet = workbook.createSheet();
		// 0번째 줄
		XSSFRow row1 = sheet.createRow(0);

		row1.createCell(0).setCellValue("날짜");
		row1.createCell(1).setCellValue("지점");
		row1.createCell(2).setCellValue("등급");
		row1.createCell(3).setCellValue("상세");
		row1.createCell(4).setCellValue("가격");

		for (int i = 0; i < list.size(); i++) {
			XSSFRow row = sheet.createRow(i + 1);
			Product p = list.get(i);

			row.createCell(0).setCellValue(p.getDay());
			row.createCell(1).setCellValue(p.getStore());
			row.createCell(2).setCellValue(p.getGrade());
			row.createCell(3).setCellValue(p.getDetail());
			row.createCell(4).setCellValue(p.getPrice());
		}

		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.xlsx";

		try (FileOutputStream bos = new FileOutputStream(path)) {

			workbook.write(bos);

		} catch (Exception e) {

		}
	}
}
