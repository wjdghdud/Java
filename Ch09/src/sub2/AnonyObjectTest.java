package sub2;

// ���� : �͸�ü, ���� p404. 

public class AnonyObjectTest {
	public static void main(String[] args) {
		
		
		// �͸� ��ü - �������̽��� Ŭ���� �������� �ٷ� new�������� ��ü�� �����ϴ� ��
		Person p = new Person() { // Ctrl + space bar �ϸ� �������̵� ���� ���� ��.
			
			@Override
			public void info() {
				System.out.println("Person info...");
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
			}
		};
		
		p.info();
		p.hello();
		
		// �������̽��� ���� stack ������ p�� ����Ű�� ��ü�� ��������. �ٸ� interface�� heap������ �����Ͱ� �ƴϱ� ������
		// p�� ����Ű�� Ŭ������ �͸��̶�� ��.
	}
}
