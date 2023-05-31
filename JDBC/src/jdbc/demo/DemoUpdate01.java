package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoUpdate01 {

	public static void main(String[] args) {

		//부서아이디, 부서이름을 입력받아서 해당 부서의 이름을 변경하는 update 구문
//		데이터베이스 연결정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin:@호스트이름:포트번호:DB이름 -database 들어가서 속성
		String uid = "HR";
		String upw = "HR";
		
		// 오라클에서 COMMIT한 후 실행 
		
		String sql = "UPDATE DEPTS\r\n"
				+ "SET DEPARTMENT_NAME = ? \r\n"
				+ "WHERE DEPARTMENT_ID = ?";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("부서이름: ");
		String name = scan.nextLine();
		System.out.print("부서아이디: ");
		String department_id = scan.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, department_id);
			
			int result = pstmt.executeUpdate();
			System.out.println("성공 or 실패: "+ result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
