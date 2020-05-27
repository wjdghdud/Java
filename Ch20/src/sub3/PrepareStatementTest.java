package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

// ���� : PrepareStatement

public class PrepareStatementTest {	// Statement�� sql�� �ǹ���. �� �غ��(prepare) sql.
	public static void main(String[] args) throws Exception{

		
/*	�̰Ÿ� ���� insertUser method�� ..
	
 		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";	// database �ּ� = heidiSQL ó�� ������ �� ������ ȣ��Ʈ��/IP �κ�
		String user = "jhy";	// database ���Ӱ���
		String pass = "1234";	// database ��й�ȣ
		
		// 1�ܰ�
		// 2�ܰ�
		// 3�ܰ�
		// 4�ܰ�
		// 5�ܰ�
		// 6�ܰ�

*/
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("����� ���(����:0, ���:1)");
			System.out.println("���� : ");
			
			int choice = sc.nextInt();
			
			if(choice == 0) {
				break;
			}
			
			System.out.println("���̵� �Է� : ");
			String uid = sc.next();
			
			System.out.println("�̸� �Է� : ");
			String name = sc.next();
			
			System.out.println("�޴��� �Է� : ");
			String hp = sc.next();
			
			System.out.println("���� �Է� : ");
			int age = sc.nextInt();
			
			insertUser(uid, name, hp, age);
			
		}while(true);
		
		System.out.println("���α׷� ����...");
		
	}	// main end
	
	public static void insertUser(String uid, String name, String hp, int age) throws Exception {
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/jhy";
		String user = "jhy";
		String pass = "1234";
				
		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		// 3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		// 4�ܰ� - SQL ����
		String sql = "INSERT INTO `USER1` VALUES ('"+uid+"', '"+name+"', '"+hp+"', "+age+")";	// �̺κ��� �߿��Ѱ���
		stmt.executeUpdate(sql);
		
		// 5�ܰ� - �����ó��(SELECT�� ���)
		// 6�ܰ� - �����ͺ��̽� ����
		stmt.close();
		conn.close();
	}
}
