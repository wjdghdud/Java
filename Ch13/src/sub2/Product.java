package sub2;

//public class Product { 
public class Product<A, B> {	// ġȯ���� �� ���� ���� ���׸� Ŭ����.
		

//	private TV item;	// TV�� ��ް�����.
	private A item;		// ���׸� ����
//	private int info;	// ������ ǥ���ϰ������ Integer, �̸��� ǥ���ϰ������ String ������ �پ��ϰ� ǥ���ϰ�;�! 
	private B info;		// �׷��� ���� show �޼����� ��ǰ������ �Ҵ�� info�� ġȯ����, B�� �����ҷ�
	
	public Product(A item, B info) {
		this.item = item;
		this.info = info;
	}
	
	public void show() {
		System.out.println("��ǰ ���� : "+item);
		System.out.println("��ǰ ���� : "+info);
	}
}
