package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 내용 : JDBC Update

public class UpdateTest {
	public static void main(String[] args) throws Exception {
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";	// database 주소 = heidiSQL 처음 눌렀을 때 나오는 호스트명/IP 부분
		String user = "jhy";	// database 접속계정
		String pass = "1234";	// database 비밀번호
				
		// 1단계 - JDBC 드라이버 동적로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn;
		conn = DriverManager.getConnection(host, user, pass);
				
		// 3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();	// stmt가 쿼리문을 실행한다.
				
		// 4단계 - SQL 실행
		String sql = "INSERT INTO `USER1` VALUES ('J101', '정철', '010-4444-4444', 52)";
		stmt.executeUpdate(sql);	// 위에서 작성한 쿼리문이 들어감
				
		// 5단계 - 결과셋(ResultSet) 처리(SELECT문일 경우에만 해당)
			// INSERT문만 사용했으므로 건너뛴다. SELECT문을 쓸 경우에만 사용.
				
		// 6단계 - 데이터베이스 종료(해제)
		stmt.close();
		conn.close();	// 1. 2단계의 try 안에 conn이 선언돼 있기 때문에 이게 안됨. 그래서

		System.out.println("UPDATE 완료...");
	}
}
