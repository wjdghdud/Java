package sub2;

public class CountThread extends Thread{

	private Count count; // Count ��ü ����.
	
	// ������
	public CountThread(Count count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=1 ; i<=1000 ; i++) {	// 1000�� �ݺ�
			count.setNum();				// ����ؼ� ��������(Count class ����) setter�κ��� ��� ��
		}
	}	// SubThread�� �����ϴ� �޼���
}
