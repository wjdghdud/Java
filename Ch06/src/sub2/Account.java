package sub2;

// ClassTest�� ���� Ŭ���� Ư���� ����� �����س��� class.

public class Account {
	
	// Ư��(Account class�� �������). �ǵ��� ��������� �ܺο��� ������ �� ������ ��ȣ�Ǿ����� ��. �׷��� ĸ��ȭ(private)��.
	//  - ���ٱ��� private ������ ��.
	//    ������ �̷��� �ϸ� ��ü�ʱ�ȭ�� �� ���� ����. �翬�� private �����̴ϱ�.
	private String bank;
	private String id; // ����
	private String name; // �Ա���
	private int money; // ���� �ܾ�
	
	// ������. class�̸��� �����ϸ� �Ű������� ��������� �״�� �Ѵ�. �����ڸ� ���� private ����� ��������� �ܺο��� �Ժη� ������� ���ϵ��� �ϱ⵵ �ϸ�
	      // ���� ��ü�ʱ�ȭ�� ���� ���ϰ� ����� ��ſ� �����ڸ� Ȱ�������ν� ��ü����� ���ÿ� ������ �ʱ�ȭ�� �� �ִ�.
	      // ��ü�� ������ �� ��������� �ʱ�ȭ�ϴ� �޼���.
	Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
		
	}
	
	// ���(Account class�� ��� �޼���(=�Լ�)). static ������ ���� ����. �ٵ� ��???????????????????????????
	//  - ���ٱ��� public ������ �Ͽ� �Լ� ȣ���� �� �� �ְ� ��.
	public void deposit(int money) { // �Ա�
		this.money += money;	// ������� money�� �޼����� money�� ���� ����� this������('.')�� �����. �翬�� ������� money��  �����̰���?
	} // input�� �Լ� ������ ������ ���������̹Ƿ� ���� �Լ����� ������ ����. �׷��� ���� �Լ��� int money�� �ٸ� ������.
	
	public void withdraw(int money) { // ��� 
		this.money -= money;
	}
	
	public void info() { // �ܾ�
		System.out.println("================");
		System.out.println("�� �� �� : " + bank);
		System.out.println("���¹�ȣ: " + id);
		System.out.println("�� �� �� : " + name);
		System.out.println("�����ܾ�: " + money);
	}
}

// �Լ�, ��������� �����ϴ� Ŭ���� �� �����ϴ� ���̺귯��(~.jar����)�� �����ϴ� �����ӿ�ũ