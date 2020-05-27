package sub4;

// ���� : 

public class Increment {	

	private int num1;
	private static int num2; // ��������(Ŭ���� ����)
	
	// (num1, 2�� �ʱ�ȭ�ϴ�)������(����ڰ� ������) ������(�ɼ�)
	public Increment() {
		num1++; // this�� ��������
		num2++; // this�� ��������
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}		// ����(���� ǥ�� �������� form���� �ʿ信 ���� ���Ƿ� ������ų �� ����. ������ ǥ������ ������ �־���� ��.)
	
	// (num1, 2�� �ʱ�ȭ�ϴ�)�ش� Ŭ���� ǥ�� ������(�ɼ�)
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}		// ǥ����(�ʼ������� �����ڸ� ������־�� ��.)
	
	// ���� �޼���(Ŭ���� �޼���)
	public static void add() {	// �̰��� static���� �����ϸ�
//		num1++;	// num1�� �Լ� �ȿ� ������ �� ����. ���ʿ� static ������ ���� ���� ������
		num2++;	// �켱������ �����Ǿ����� static �޼��� �ȿ� ���� ���� ����. ������ ���� ���� �ʾ����ϱ�.
	}			// static�� static������ ���踦 �̷� �� ����.
}
