package sub3;

// ���� : ���� p576

public class AddThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
/*
		at1.start();
		at2.start();	// �������̽��� ������ ���̱� ������ �Ϻ��� �����尡 �ƴϾ�. �׷��� ���⿡�� �����尴ü�� �����ؾ� ��.
*/
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2); // ������ ��ü ����
		
		//run : ���� ������
//		t1.run();
//		t2.run();
		
		//start : ��Ƽ ������
		t1.start();
		t2.start(); // start�� �ϸ� �ȵ˴ϴ�. sub2�� ����� ���������� join�� �߰����־�� �մϴ�. ��Ƽ������ŵ�� throws�� �翬�� �������� �߸� Ŀ���÷��� �ذ��Ͻñ���
		
		t1.join();
		t2.join();
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		int total = tot1 + tot2;
		
		System.out.println("��ü �� : " +total); // �̷��� �ϸ� �ȳ���.
		
	}
}
