package sub5;

import java.util.Calendar; // Calendar ġ�� ��Ʈ�� + �����̽���

// ���� : Calendar Ŭ���� �ǽ��ϱ�, ���� p538.

public class CalendarTest {
	public static void main(String[] args) {
		
//		Calendar cal = new Calendar(); �̱��� ��ü�� �̷��� heap�Ҵ��� ����.
		Calendar cal = Calendar.getInstance(); // �̱��� ��ü(Ch06-sub4) ����
		
		int year = cal.get(Calendar.YEAR); // �̰� �ʵ��� �ϴ� ���̷�.
		int month = cal.get(Calendar.MONTH)+1; // 1���� 0�̴ϱ� +1.
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d�� %d�� %d��\n", year, month, date);
		System.out.printf("%d�� %d�� %d��\n", hour, minute, second);
	}
}
