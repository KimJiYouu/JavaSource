package jdbc.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DeomSelect01 {
	public static void main(String[] args) {

//		데이터베이스 연결정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin:@호스트이름:포트번호:DB이름 -database 들어가서 속성
		String uid = "HR";
		String upw = "HR";

//      쿼리 작성
		String sql = "SELECT * FROM EMPLOYEES WHERE SALARY > ?"; // 전달될 값을 ?로 나타낸다.

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

//		모든 데이터베이스 연결은 try-catch 안에서 작성되어야 함
		try {
			// 1. 드라이버 클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 커넥션 객체 생성
			conn = DriverManager.getConnection(url, uid, upw);

			// 3. 커넥션 객체에서 state객체 생성
			pstmt = conn.prepareStatement(sql);
			
			// 3-2. sql 문에 전달할 값이 있다면 ?로 처리하고 순서대로 1번부터 시작한다.
			// ?에 전달될 값은 set메서드를 이용해서 채운다.
			// setString, setInt, setDouble, setdDate, setTimestamp
			pstmt.setInt(1, 15000); //첫번째 물음표, 5000원
			
			
			// 4. spl 문의 실행
			// select는 executeQuery()
			// update, insert, delete 문장은 executeUpdate()
			rs = pstmt.executeQuery(); // ResultSet : 데이터베이스의 값을 담는 객체

			
			// 5. rs.next() 다음행이 있으면 다음행으로 접근한다.
			while (rs.next()) { // 한 행에서 처리할 접은을 while문 안에 넣으면 된다.

				String first_name = rs.getString("FIRST_NAME"); // getString, getInt, getDouble, getDate, getTime
				int salary = rs.getInt("SALARY");
				double pct = rs.getDouble("COMMISSION_PCT");
				Date date = rs.getDate("HIRE_DATE"); // java.sql 패키지
				Timestamp date2 = rs.getTimestamp("HIRE_DATE"); // java.sql 패키지

				System.out.println(first_name);
				System.out.println(salary);
				System.out.println(pct);
				System.out.println(date);
				System.out.println(date2);
				System.out.println("-------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
