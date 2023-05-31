package quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {

		// 지역명, 규모구분, 연도, 월, 분양가격 -> 1행 x 4800개
		/*
		 * 1. 버퍼리더 이용해서 한줄씩 읽음 
		 * 2. split(",",5) 를 사용해서 Data 객체에 한줄 단위로 저장을 하고 
		 * 3. List<Data>에 하나씩 추가를 한다
		 * 4. 람다식을 이용해서 (지역: 서울, 4분기 9~12월, 분양가격: 2000 이상)인 객체만 뽑아서 새로운 리스트로 반환.
		 * 
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz21\\주택도시보증공사_전국 평균 분양가격.csv";
		String[] arr = new String[5];
		List<Data> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))) {
			String result;

			br.readLine(); // (제목행) 한번 넘어감
			while ((result = br.readLine()) != null) {
				arr = result.split(",", 5);
				Data data = new Data(arr[0], arr[1], arr[2], arr[3], arr[4]);
				list.add(data);

			}

			List<Data> newList = list.stream().filter(a -> a.getRegion().equals("부산")
					&& (a.getMonth().equals("9") || a.getMonth().equals("10") || a.getMonth().equals("11")|| a.getMonth().equals("12"))
					&& Integer.parseInt(a.getPrice().replace(",", "").replace("\"", "").replace(" ", "").replace("", "0")) >= 2000).collect(Collectors.toList());

			System.out.println(newList.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
