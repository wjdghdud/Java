package sub3;

public class AddThread extends Add implements Runnable{ // Add class���� ��ӹ޴´�. implements Runnable : interface�ε� �̰� ����? ��ư �������̽��ϱ� �߻�޼��尡 �ʿ���

	private int start;
	private int end;
	
	// ������
	public AddThread (int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	
	@Override // �߻�޼���
	public void run() {
		for(int k=start ; k<=end ; k++) {
			setNum(k);
		} // start���� end������ ��. setNum method �����غ���.
	}

}
