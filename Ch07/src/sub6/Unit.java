package sub6;

// ���� : Abstract class�� �߻�Ŭ����

public abstract class Unit { // 'abstract'�� �����Ͽ� �߻�Ŭ�������� ǥ������. ����  public class Unit {}��.
	
	public void move() {
		System.out.println("Unit move...");
	}
	
	// �߻�޼���
	public abstract void attack();
}
