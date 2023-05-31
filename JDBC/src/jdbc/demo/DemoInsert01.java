package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoInsert01 {

	public static void main(String[] args) {
		
//		데이터베이스 연결정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin:@호스트이름:포트번호:DB이름 -database 들어가서 속성
		String uid = "HR";
		String upw = "HR";
		
		//입력될 값은 콘솔로 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("부서이름> ");
		String name = scan.nextLine();
		System.out.print("매니저아이디> ");
		String manager_id = scan.nextLine();
		System.out.print("지역번호> ");
		String location_id = scan.nextLine();

		
		//insert, update, delete는 ResultSet 객체가 필요없음
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)\r\n"
				+ "VALUES(depts_seq.nextval, ?, ?, ? )";
		
		try {
			//1. 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. conn
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3. pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name); //첫번째 물음표, name
			pstmt.setInt(2, Integer.parseInt(manager_id)); // sql은 자동형변환이 되지만 굳이 정수로 바꿀때 
			pstmt.setString(3, location_id); // 자동형변환
			
			//4. sql 실행
			int result = pstmt.executeUpdate();
			System.out.println("성공실패? : "+result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
