package sub1;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

// 날짜 : 2020.05.26
// 내용 : JDBC 프로그래밍

/*	------- JDBC 프로그래밍 -------

자바 프로그램을 가지고 데이터베이스(MySQL)로 쿼리문(SQL)을 주면 직접적으로 보내지는 못하고
대신해주는 Driver(JDBC, Java DataBase Connector)를 필요로 한다. 이것을 MySQL에서 설치해야 하는데
이것은 mysql-connector-java-5.1.49.jar, Database 클래스에 있음. 이것을 추가(lib polder에 mysql~을 추가)해줘야 함.


*/

public class JDBCTest {
	public static void main(String[] args) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";	// database 주소 = heidiSQL 처음 눌렀을 때 나오는 호스트명/IP 부분
		String user = "jhy";	// database 접속계정
		String pass = "1234";	// database 비밀번호
		
		// 1단계 - JDBC 드라이버 동적로드(자바프로그램과 DB 사이에 드라이버를 설치)
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		java.sql.Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("데이터베이스 접속 성공!");
		}
		
		// 3단계 - 3 ~ 5 단계는 쿼리문 실행
		// 4단계
		// 5단계
		
		// 6단계 - 데이터베이스 종료
		conn.close();
	}
}
