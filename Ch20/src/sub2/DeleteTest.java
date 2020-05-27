package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// 내용 : JDBC Delete

public class DeleteTest {
	public static void main(String[] args) throws Exception {
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";	// database 주소 = heidiSQL 처음 눌렀을 때 나오는 호스트명/IP 부분
		String user = "jhy";	// database 접속계정
		String pass = "1234";	// database 비밀번호
		
		// 1단계
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3단계
		Statement stmt = conn.createStatement();
		
		// 4단계
		String sql = "DELETE FROM `USER1` WHERE `uid` = 'J101';";
		stmt.executeUpdate(sql);
		
		// 5단계
		// 6단계
		stmt.close();
		conn.close();
		
		System.out.println("DELETE 완료...");
	}
}
