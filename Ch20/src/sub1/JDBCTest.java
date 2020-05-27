package sub1;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

// ��¥ : 2020.05.26
// ���� : JDBC ���α׷���

/*	------- JDBC ���α׷��� -------

�ڹ� ���α׷��� ������ �����ͺ��̽�(MySQL)�� ������(SQL)�� �ָ� ���������� �������� ���ϰ�
������ִ� Driver(JDBC, Java DataBase Connector)�� �ʿ�� �Ѵ�. �̰��� MySQL���� ��ġ�ؾ� �ϴµ�
�̰��� mysql-connector-java-5.1.49.jar, Database Ŭ������ ����. �̰��� �߰�(lib polder�� mysql~�� �߰�)����� ��.


*/

public class JDBCTest {
	public static void main(String[] args) throws Exception {
		
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";	// database �ּ� = heidiSQL ó�� ������ �� ������ ȣ��Ʈ��/IP �κ�
		String user = "jhy";	// database ���Ӱ���
		String pass = "1234";	// database ��й�ȣ
		
		// 1�ܰ� - JDBC ����̹� �����ε�(�ڹ����α׷��� DB ���̿� ����̹��� ��ġ)
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		java.sql.Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("�����ͺ��̽� ���� ����!");
		}
		
		// 3�ܰ� - 3 ~ 5 �ܰ�� ������ ����
		// 4�ܰ�
		// 5�ܰ�
		
		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
	}
}
