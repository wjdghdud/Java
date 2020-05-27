package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

// 내용 : PrepareStatement

public class PrepareStatementTest {	// Statement는 sql을 의미함. 즉 준비된(prepare) sql.
	public static void main(String[] args) throws Exception{

		
/*	이거를 밑의 insertUser method로 ..
	
 		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";	// database 주소 = heidiSQL 처음 눌렀을 때 나오는 호스트명/IP 부분
		String user = "jhy";	// database 접속계정
		String pass = "1234";	// database 비밀번호
		
		// 1단계
		// 2단계
		// 3단계
		// 4단계
		// 5단계
		// 6단계

*/
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("사용자 등록(종료:0, 등록:1)");
			System.out.println("선택 : ");
			
			int choice = sc.nextInt();
			
			if(choice == 0) {
				break;
			}
			
			System.out.println("아이디 입력 : ");
			String uid = sc.next();
			
			System.out.println("이름 입력 : ");
			String name = sc.next();
			
			System.out.println("휴대폰 입력 : ");
			String hp = sc.next();
			
			System.out.println("나이 입력 : ");
			int age = sc.nextInt();
			
			insertUser(uid, name, hp, age);
			
		}while(true);
		
		System.out.println("프로그램 종료...");
		
	}	// main end
	
	public static void insertUser(String uid, String name, String hp, int age) throws Exception {
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";
		String user = "jhy";
		String pass = "1234";
				
		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		// 3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		// 4단계 - SQL 실행
		String sql = "INSERT INTO `USER1` VALUES ('"+uid+"', '"+name+"', '"+hp+"', "+age+")";	// 이부분이 중요한갑다
		stmt.executeUpdate(sql);
		
		// 5단계 - 결과셋처리(SELECT일 경우)
		// 6단계 - 데이터베이스 종료
		stmt.close();
		conn.close();
	}
}
