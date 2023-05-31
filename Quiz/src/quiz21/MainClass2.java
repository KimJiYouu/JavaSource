package quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass2 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz21\\주택도시보증공사_전국 평균 분양가격.csv";
		
		List<Data> list = new ArrayList<>();
		String[] arr = new String[5];
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))) {
			
			String result;
			br.readLine();
			while((result = br.readLine())!= null) {
				arr = result.split(",",5);
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price = arr[4].replace(" ", "").replace(",", "").replace("\"", "").replace("-", "");
				price = price.equals("") ? "0": price;
				
				Data data = new Data(region, size, year, month, price);
				list.add(data);
				
			}
			
			List<Data> newList = list.stream().filter(a -> a.getRegion().equals("서울")
					&& (a.getMonth().equals("9") || a.getMonth().equals("10")||a.getMonth().equals("11") || a.getMonth().equals("12")) 
					&& Integer.parseInt(a.getPrice()) >= 2000).collect(Collectors.toList());
			
			System.out.println(newList.toString());
					
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
