package sub1;

// ���� : interface

public interface RemoteControl { // class ��� interface��. �� interface��� �ϴ� ����ü��� �ǹ�.
	
	public abstract void powerOn(); // �����ѱ�
	public abstract void powerOff(); // ��������
	
	// abstract ������ ������ ���� �ִ�.
	public void chUp(); // ä�� ��
	public abstract void chDown(); // ä�� �ٿ�
	
	public abstract void soundUp(); // ���� ��
	public void soundDown(); // ���� �ٿ�
	
}

// ������ �޼��带 ������ �� ��ü�� ����.
