package sub1;

import java.util.Scanner;

// ��¥ : 2020.05.21
// ���� : �⺻ �����, ���� p994.

public class BasicIOTest {
	public static void main(String[] args) {
		
		// ������� �⺻ : stream(������ ���. �Է°� ����� ���� �ְ�޴� ��ü�� ������ ������� ���� ��.)
		
		// �ý��� �⺻ �Է� ��Ʈ��
		Scanner sc = new Scanner(System.in);	// Ű���� ��ü
		
		// �ý��� �⺻ ���� ��Ʈ��
		System.out.println("�̸� �Է� : ");
		
		String name = sc.nextLine();
		
		System.out.println("�̸� : "+name);
	}
}
