package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// ���� : JDBC Delete

public class DeleteTest {
	public static void main(String[] args) throws Exception {
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";	// database �ּ� = heidiSQL ó�� ������ �� ������ ȣ��Ʈ��/IP �κ�
		String user = "jhy";	// database ���Ӱ���
		String pass = "1234";	// database ��й�ȣ
		
		// 1�ܰ�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ�
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3�ܰ�
		Statement stmt = conn.createStatement();
		
		// 4�ܰ�
		String sql = "DELETE FROM `USER1` WHERE `uid` = 'J101';";
		stmt.executeUpdate(sql);
		
		// 5�ܰ�
		// 6�ܰ�
		stmt.close();
		conn.close();
		
		System.out.println("DELETE �Ϸ�...");
	}
}
