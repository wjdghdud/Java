package sub1;

// ���� : ����ó��, ���� p422.

// �������� ��, ���� ���� �̺�Ʈ�� �߻��ص� �׳� ����������

public class ExeptionTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0; // ������ ������ �Ұ�����. �׷����� �����ϰ� �ǳ� �� �� �ִ� ����� ����ó��(try)�� ���� �����ϴ�.
		
		
		int r1, r2, r3, r4 = 0;
		
		try {
			// ������ �߻��� ���ɼ��� �ִ� �ڵ������ ���� ��.
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
			
		}catch (Exception e) {	// ���� ������ ��µǴ� �ڵ�
			// ������ �߻����� �� ó���� ����.
			e.printStackTrace();
		}
		
		
		/* r4�� �������� �ʾ��� �� try �ȿ��� ������ �ϸ�, �� �ٱ������� sysout r4�� �Ұ���.
		
		try {
			
		int r4 = num1 / num2;
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		�̷��Ե� �غ��� �׳� �� ������ �˰ž�.
		*/
		
		
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
		
		
		
		System.out.println("���α׷� ����...");
	}
}
