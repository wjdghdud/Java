package sub5;

import java.text.SimpleDateFormat; //SimpleDateFormat + ��Ʈ�� + �����̽���
import java.util.Date; // date ���� ��Ʈ�� + �����̽���, util ����

// Date class, ���� p538.

public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date(); // date ���� ��Ʈ�� + �����̽��� �ϸ� , java.sql�� util�� �ִµ�, util�� select.
		System.out.println("date : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss");
		String now = sdf.format(date);
		
		System.out.println("now : "+now);
	}
}
