package sub1;

// ���� : �������̽� �ǽ��ϱ�

/* ----- note -----
 
 �Ϻ��� �޼��带 ���� �� �ִ� �߻�Ŭ������ �ִµ� �̰ͺ��� ���� �߻�������
 ����'��' �� �� �ִ� �޼��带 ������ �ϴ� �������̽��� �ִ�. �� ������ �޼��带 ������ �� ����.

*/

public class InterfaceTest1 {
	public static void main(String[] args) {
		
		// �������̽��� ���� : Ŭ���� ������ ǥ�� ���̵� ����
		
//		RemoteLG lg = new RemoteLG();
		RemoteControl lg = new RemoteLG(); // ������ ����
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
//		RemoteSamsung samsung = new RemoteSamsung();
		RemoteControl samsung = new RemoteSamsung(); 
		// ��ǻ� �������� �����ؼ� interface�� �����Ѱǵ� �̰�, ��� ū ���̴� ���� interface�� �޼��带 �����ϴ� �Ͱ� class�� �޼��带 �����ϴ� ���̰� �־�. interface�� ���������� �Ǿ�
		// �� ���� �޼��尡 ������ ������ �������̵�(RemoteControl�� RemoteSamung�� ���� �������̵�) �Ǿ� ������ ����Ǵ� �޼���� �ش� Ŭ�����̴�. �׷����� �ұ��ϰ� �̷��� ������ �׳� �������� ���� ����ȭ
		samsung.powerOn();
		samsung.chUp();
		samsung.soundUp();
	}
}
