package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// ���� : JDBC Update

public class UpdateTest {
	public static void main(String[] args) throws Exception {
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";	// database �ּ� = heidiSQL ó�� ������ �� ������ ȣ��Ʈ��/IP �κ�
		String user = "jhy";	// database ���Ӱ���
		String pass = "1234";	// database ��й�ȣ
				
		// 1�ܰ� - JDBC ����̹� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn;
		conn = DriverManager.getConnection(host, user, pass);
				
		// 3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();	// stmt�� �������� �����Ѵ�.
				
		// 4�ܰ� - SQL ����
		String sql = "INSERT INTO `USER1` VALUES ('J101', '��ö', '010-4444-4444', 52)";
		stmt.executeUpdate(sql);	// ������ �ۼ��� �������� ��
				
		// 5�ܰ� - �����(ResultSet) ó��(SELECT���� ��쿡�� �ش�)
			// INSERT���� ��������Ƿ� �ǳʶڴ�. SELECT���� �� ��쿡�� ���.
				
		// 6�ܰ� - �����ͺ��̽� ����(����)
		stmt.close();
		conn.close();	// 1. 2�ܰ��� try �ȿ� conn�� ����� �ֱ� ������ �̰� �ȵ�. �׷���

		System.out.println("UPDATE �Ϸ�...");
	}
}
