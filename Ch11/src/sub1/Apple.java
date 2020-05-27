package sub1;

public class Apple  extends Object{ // ����  extends Object�� �������� �ʾƵ� ��. ��� Ŭ������ �θ� Ŭ������  Object Ŭ�����̱� ����

	private String country;
	private int price;
	
	// ������
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
	
	// ���� info ���� �ƿ� override �޼��带 ������ �� ����.
	@Override
		public String toString() { // tos�ϰ� ��Ʈ��+�����̽���. �̹� ������Ʈ Ŭ������ ���ǵǾ� �ִ� �޼���.

		System.out.println("������ : " +country);
		System.out.println("���� : "+price);
		// �׷��� �׳� �̷��� �ְ���� �� ����� ��.
		
		return super.toString();
		}
}

/*

JRE System Library : �ڹ�Ŭ������ ��Ƶ� jar ������ �ְ�, ���� �� �ȿ� ��Ű������ ������ ���� �پ��� ������ �ʿ� ���� Ŭ����(�ڹٿ��� �⺻������ �������ִ�)���� �ִ�.
�� ���̺귯���� �ִ� Ŭ������ �� Object Ŭ������ �ִµ� �� Object Ŭ������ ��� Ŭ������ �߿��� �ֻ��� Ŭ�����̴�. ��� ���⿡�� �ۼ��� Apple Ŭ������ Object Ŭ������
����� �ް� �ִ� ��. ���� extends Object�� ���� ��������� �ʾƵ� ����� ����

*/
