package sub1;

public class Account {
	//Ư��(�ɹ�����)
	protected String bank; 
	//private ���ٱ��� 
	//(�� �ɹ������� �߿��� ����� �ϹǷ� ��ȣ�� ������ϹǷ� private�� �Ἥ ĸ��ȭ�Ѵ�.)
	// �ڽ�Ŭ�������� ������ ����� �ɶ��� protected �������� ����
	protected String id;
	protected String name;
	protected int money;
	
	// ������ : ��ü�� ���� �Ҷ� �ɹ������� �ʱ�ȭ�ϴ� �޼���
	// (�� �����ڴ� ������ �����ϵ��� ������ش�)
 	Account(String bank, String id, String name, int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	
	//���(�޼���)
	public void deposit(int money) {
		this.money += money;
	} //this.Account = Account Ŭ������ money�� �����ض��� ��
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {	
		System.out.println("===================");
		System.out.println("����� : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�� �� �� : "+name);
		System.out.println("�����ܾ� : "+money);
	}	
} //�Լ��� ��Ƶа� Ŭ��������Ѵ�.
  //Ŭ������ ��Ƶа� ���̺귯������Ѵ�.	(.jar)
  //���̺귯���� ��Ƶа� �����ӿ�ũ����Ѵ�.(Spring)

	
	
